package healthcare;

import java.sql.*;

public class PatientDB {

    // CREATE
    public static void addPatient(Patient p) {
        String sql = "INSERT INTO patients(name, age, ward_number) VALUES (?, ?, ?)";
        try (Connection con = Database.connect();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, p.getName());
            ps.setInt(2, p.getAge());
            ps.setInt(3, p.getWard().getWardNumber());
            ps.executeUpdate();
            System.out.println("Patient added!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // READ
    public static void readPatients() {
        String sql = "SELECT * FROM patients";
        try (Connection con = Database.connect();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                                rs.getString("name") + " " +
                                rs.getInt("age") + " " +
                                rs.getInt("ward_number")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // UPDATE по имени
    public static void updatePatient(String name, int newAge) {
        String sql = "UPDATE patients SET age=? WHERE name=?";
        try (Connection con = Database.connect();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, newAge);    // напрямую число, а не p.age
            ps.setString(2, name);
            ps.executeUpdate();
            System.out.println("Patient updated!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    // DELETE по имени
    public static void deletePatient(String name) {
        String sql = "DELETE FROM patients WHERE name=?";
        try (Connection con = Database.connect();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, name);
            ps.executeUpdate();
            System.out.println("Patient deleted!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

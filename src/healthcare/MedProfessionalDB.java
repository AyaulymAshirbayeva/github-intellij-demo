package healthcare;

import java.sql.*;

public class MedProfessionalDB {
    public static void clearMedProfessionals() {
        String sql = "TRUNCATE TABLE medprofessionals RESTART IDENTITY";
        try (Connection con = Database.connect();
             Statement st = con.createStatement()) {
            st.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void addMedProfessional(MedProfessional m) {
        String sql = "INSERT INTO medprofessionals(name, specialization, experience) VALUES (?, ?, ?)";
        try (Connection con = Database.connect();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, m.getName());
            ps.setString(2, m.getSpecialization());
            ps.setInt(3, m.getExperience());
            ps.executeUpdate();
            System.out.println("MedProfessional added!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void readMedProfessionals() {
        String sql = "SELECT * FROM medprofessionals order by id";
        try (Connection con = Database.connect();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                                rs.getString("name") + " " +
                                rs.getString("specialization") + " " +
                                rs.getInt("experience")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void updateMedExperience(String name, int newExperience) {
        String sql = "UPDATE medprofessionals SET experience=? WHERE name=? ";
        try (Connection con = Database.connect();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, newExperience);
            ps.setString(2, name);
            ps.executeUpdate();
            System.out.println("MedProfessional experience updated!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deleteMedProfessional(String name) {
        String sql = "DELETE FROM medprofessionals WHERE name=?";
        try (Connection con = Database.connect();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, name);
            ps.executeUpdate();
            System.out.println("MedProfessional deleted!");
        } catch (Exception e) {
            e.printStackTrace();  //for git
        }
    }
}

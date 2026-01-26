package healthcare;

import java.sql.*;

public class HospitalDB {
    public static void clearHospitals() {
        String sql = "TRUNCATE TABLE hospitals RESTART IDENTITY";
        try (Connection con = Database.connect();
             Statement st = con.createStatement()) {
            st.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void addHospital(Hospital h) {
        String sql = "INSERT INTO hospitals(name, capacity, rating) VALUES (?, ?, ?)";
        try (Connection con = Database.connect();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, h.getName());
            ps.setInt(2, h.getCapacity());
            ps.setDouble(3, h.getRating());
            ps.executeUpdate();
            System.out.println("\nHospital added!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void readHospitals() {
        String sql = "SELECT * FROM hospitals order by id";
        try (Connection con = Database.connect();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                                rs.getString("name") + " " +
                                rs.getInt("capacity" ) + " " +
                                rs.getDouble("rating")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void updateHospitalRating(String name, double newRating) {
        String sql = "UPDATE hospitals SET rating=? WHERE name=?";
        try (Connection con = Database.connect();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setDouble(1, newRating);
            ps.setString(2, name);
            ps.executeUpdate();
            System.out.println("\nHospital rating updated!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deleteHospital(String name) {
        String sql = "DELETE FROM hospitals WHERE name=?";
        try (Connection con = Database.connect();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, name);
            ps.executeUpdate();
            System.out.println("\nHospital deleted!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

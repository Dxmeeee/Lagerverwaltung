package Datenbank;
//ufiegiufewbuifubwehiofiheniovcievfieniov
import java.sql.*;

public class Auslesen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("MySQl Connect Example V2 AWS");

		Connection conn = null;

		String url = "jdbc:mysql://3.69.96.96:80/";
		String dbName = "db1";
		String driver = "com.mysql.cj.jdbc.Driver";
		String userName = "db1";
		String pw = "!db1.wip23?WS6";

		try {

			Class.forName(driver);
			conn = DriverManager.getConnection(url + dbName, userName, pw);
			System.out.println("Connected to database");

			Statement stmt = conn.createStatement();
			ResultSet rs;

			rs = stmt.executeQuery(
					"SELECT produktnr, hersteller, typbezeichnung, flur, regal, spalte, menge FROM festplatte");

			while (rs.next()) {
				int produktnummer = rs.getInt("produktnr");
				String hersteller = rs.getString("hersteller");
				String typbezeichnung = rs.getString("typbezeichnung");
				String flur = rs.getString("flur");
				String regal = rs.getString("regal");
				String spalte = rs.getString("spalte");
				int menge = rs.getInt("menge");

				/*
				 * System.out.println("Produktnummer: "+ produktnummer);
				 * System.out.println("Hersteller: "+ hersteller);
				 * System.out.println("typbezeichnung: "+typbezeichnung);
				 * System.out.println("Flur: "+ flur); System.out.println("regal: "+regal);
				 * System.out.println("spalte: "+spalte); System.out.println("menge: "+menge);
				 */

				System.out.println("Produktnummer: " + produktnummer + " Hersteller: " + hersteller
						+ " typbezeichnung: " + typbezeichnung + " flur: " + flur + " regal: " + regal + " spalte: "
						+ spalte + " menge: " + menge);

			}
			conn.close();
			System.out.println("Disconnected from database");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

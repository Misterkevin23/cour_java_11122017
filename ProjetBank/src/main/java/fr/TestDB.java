package fr;

import java.sql.DriverManager;
import java.sql.SQLException;

public class TestDB {

	public static void main(String[] args) {
		String login = "root";
		String pwd = "root";

		String driver = "com.mysql.jdbc.Driver"; // C'est toujours le nom d'une classe JAVA
		String url = "jdbc:mysql://localhost:3306/banque?useSSL=false"; // la connexion à mysql se fais en SSL, en
		// mettant false on envoi l'option de desactiver
		// la securité

		// charger le driver en memoire
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(-1);
		}

		java.sql.Connection connexion = null;
		java.sql.ResultSet resultat = null;
		java.sql.Statement statement = null;
		// on se connecte sur la base
		try {
			connexion = DriverManager.getConnection(url, login, pwd);
			// Portera la requete
			statement = connexion.createStatement();
			// Recuperation du resultat
			resultat = statement.executeQuery("select * from utilisateur");
			while (resultat.next()) {
				String nom = resultat.getString("nom");
				String prenom = resultat.getString("prenom");
				int id = resultat.getInt("id");
				System.out.println(nom + " " + prenom + " " + id);
			}
			// Tres mauvaise de mettre les fermeture ici car si il y a une erreur dans la
			// requete on passe directement dans le catch donc on ne fermera pas les dossier
			// resultat.close();
			// statement.close();
			// connexion.close();
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			if (resultat != null) {
				try {
					resultat.close();
				} catch (SQLException e) {
					// TODO: handle exception
				}
			}
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					// TODO: handle exception
				}
			}

			if (connexion != null) {
				try {
					connexion.close();
				} catch (SQLException e) {
					// TODO: handle exception
				}
			}

		}

	}

}

import com.mongodb.client.*; 
import org.bson.Document; 
import java.sql.*;
import java.util.Properties;

public class Main {
  // MongoDB connection details
  private static ﬁnal String MONGODB_URI = "mongodb://localhost:27017"; 
  private static ﬁnal String MONGODB_DATABASE = "database";
  private static ﬁnal String MONGODB_COLLECTION = "collection";

  // Oracle connection details
  private static ﬁnal String ORACLE_URL = "jdbc:oracle:thin:@localhost:1521:xe"; 
  private static ﬁnal String ORACLE_USER = "localhost";
  private static ﬁnal String ORACLE_PASSWORD = "divya";

  // PostgreSQL connection details
  private static ﬁnal String POSTGRES_URL = "jdbc:postgresql://localhost:5432/postgres"; 
  private static ﬁnal String POSTGRES_USER = "localhost";
  private static ﬁnal String POSTGRES_PASSWORD = "divya";

  public static void main(String[] args) {
    // MongoDB connection
    try (MongoClient mongoClient = MongoClients.create(MONGODB_URI)) { 
      MongoDatabase database = mongoClient.getDatabase(MONGODB_DATABASE); 
      MongoCollection<Document> collection = database.getCollection(MONGODB_COLLECTION); 
      System.out.println("Connected to MongoDB successfully.");
    } catch (Exception e) {
      System.err.println("Failed to connect to MongoDB: " + e.getMessage());
    }

    // Oracle connection
    try (Connection connection = DriverManager.getConnection(ORACLE_URL, ORACLE_USER, ORACLE_PASSWORD)) {
      System.out.println("Connected to Oracle database successfully.");
    } catch (SQLException e) {
      System.err.println("Failed to connect to Oracle database: " + e.getMessage());
    }

    // PostgreSQL connection
    try (Connection connection = DriverManager.getConnection(POSTGRES_URL, POSTGRES_USER, POSTGRES_PASSWORD)) {
      System.out.println("Connected to PostgreSQL database successfully.");
    } catch (SQLException e) {
      System.err.println("Failed to connect to PostgreSQL database: " + e.getMessage());
    }
  }
}

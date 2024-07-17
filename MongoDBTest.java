import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;

public class MongoDBTest {
    public static void main(String[] args) {
        String connectionString = "mongodb://localhost:27017"; // Update this to your MongoDB connection string
        try (MongoClient mongoClient = MongoClients.create(connectionString)) {
            MongoDatabase database = mongoClient.getDatabase("testdb"); // Replace with your database name
            System.out.println("Connected to the database successfully");
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}

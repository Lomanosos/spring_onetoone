package hiber.model;


import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

   private Long id;
   private String firstName;
   private String lastName;
   private String email;

   private Car car;


   public User() {

   }

   public User(String firstName, String lastName, String email, Car car) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.email = email;
      this.car = car;
   }

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
   public Long getId() {
      return id;
   }
   @Column(name = "first_name")
   public String getFirstName() {
      return firstName;
   }

   @Column(name = "last_name")
   public String getLastName() {
      return lastName;
   }
   @Column(name = "email")
   public String getEmail() {
      return email;
   }

   @OneToOne
   @JoinColumn(name = "users_car", referencedColumnName = "id")
   public Car getCar() {
      return car;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public void setCar(Car car) {
      this.car = car;
   }

   @Override
   public String toString() {
      return "User{" +
              "id=" + id +
              ", firstName='" + firstName + '\'' +
              ", lastName='" + lastName + '\'' +
              ", email='" + email + '\'' +
              ", car=" + car +
              '}';
   }

   @Override
   public int hashCode() {
      return super.hashCode();
   }

   @Override
   public boolean equals(Object obj) {
      return super.equals(obj);
   }
}

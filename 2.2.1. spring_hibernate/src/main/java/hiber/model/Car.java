package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
    private Long id;
    private String model;
    private int series;

    public Car() {
    }
    public Car(String m, int s) {
        model = m;
        this.series = s;
    }

    @Column(name = "model")
    public String getModel() {
        return model;
    }

    @Column(name = "series")
    public int getSeries() {
        return series;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
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

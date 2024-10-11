package models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="students")
@Getter
@Setter
@ToString
@NamedQueries(
        {
                @NamedQueries(name="Student.findAll", query ="SELECT s FROM Student s")
        }
)

public class Student {
    @colum(unique =true)
    private String cif;
    @Colum(nullable = false)
    @Length(min = 3, max= 60)
    private String LastName;

}

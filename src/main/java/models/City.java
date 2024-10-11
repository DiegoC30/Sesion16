package models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

@Entity
@Table
@Getter
@Setter
@ToString
@NamedQueries(
        {
                @NamedQueries(name = "city.findAll," query =  "SELECT c FROM City c)"
                        }
                )

        public class City extends BaseEntity {
        @Column(nullable = false)
        @Length(min = 3, max = 60)
        private String name;

        @Column(nullable = false,columnDefinition = "boolean default true")
        private boolean state =true;

        }
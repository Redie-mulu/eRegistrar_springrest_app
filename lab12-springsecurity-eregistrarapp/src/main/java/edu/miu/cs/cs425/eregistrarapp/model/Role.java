package edu.miu.cs.cs425.eregistrarapp.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    @NotBlank(message = "role can not be blanc, empty string or null")
    private String name;

    @ManyToMany(mappedBy="roles")
    @JsonBackReference
    private List<User> users;

    public Role(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
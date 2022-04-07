package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "RegistroSanitario")
public class RegistroSanitario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String nombre;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

//<plugins>
//			<plugin>
//				<groupId>org.springframework.boot</groupId>
//				<artifactId>spring-boot-maven-plugin</artifactId>
//				<configuration>
//					<excludes>
//						<exclude>
//							<groupId>org.projectlombok</groupId>
//							<artifactId>lombok</artifactId>
//						</exclude>
//					</excludes>
//				</configuration>
//			</plugin>
//		</plugins>

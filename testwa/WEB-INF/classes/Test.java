package entity;

import com.dao.annotation.*;
import com.dao.annotation.conf.ForeignType;


@Table(name = "test")
public class Test {
	@PrimaryKey
	@GeneratedValue(autoIncrement = true)
	@Column(name = "id")
	Integer id;
	@Column(name = "nom")
	String nom;
	@Column(name = "age")
	Integer age;


	public Test(){}
	public Integer getId(){
		return this.id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public String getNom(){
		return this.nom;
	}
	public void setNom(String nom){
		this.nom = nom;
	}
	public Integer getAge(){
		return this.age;
	}
	public void setAge(Integer age){
		this.age = age;
	}

}

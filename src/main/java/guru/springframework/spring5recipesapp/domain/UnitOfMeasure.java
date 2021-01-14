package guru.springframework.spring5recipesapp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UnitOfMeasure {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String unitMeasure;


    private Long getId(){
        return id;
    }

    private void setId(Long id){
        this.id=id;
    }

    public String getUnitMeasure(){
        return unitMeasure;
    }

    public void setUnitMeasure(String uom){
        this.unitMeasure=unitMeasure;
    }


}
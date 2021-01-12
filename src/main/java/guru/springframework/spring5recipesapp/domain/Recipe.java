package guru.springframework.spring5recipesapp.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String URL;
    private String direction;
    //todo add enum
    //Difficulty difficulty
    @Lob
    private byte[] image;

    //Relationship attributes
    @OneToOne(cascade= CascadeType.ALL)
    private Notes notes;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "recipe")
    private Set<Ingredient> ingredients=new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrepTime() {
        return prepTime;
    }

    public void setPrepTime(Integer prepTime) {
        this.prepTime = prepTime;
    }

    public Integer getCookTime() {
        return cookTime;
    }

    public void setCookTime(Integer cookTime) {
        this.cookTime = cookTime;
    }

    public Integer getServings() {
        return servings;
    }

    public void setServings(Integer servings) {
        this.servings = servings;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Notes getNotes() {
        return notes;
    }

    public void setNotes(Notes notes) {
        this.notes = notes;
    }

    public Set<Ingredient> getIngredients(){
        return ingredients;
    }

    public void setIngredients(Set<Ingredient> ingredients){
        this.ingredients=ingredients;
    }

}

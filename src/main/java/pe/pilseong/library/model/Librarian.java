package pe.pilseong.library.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Table
@EqualsAndHashCode(callSuper = false)
@Entity
@Data
public class Librarian extends User {
  
}

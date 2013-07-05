/**
 * Account.java
 */
package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.db.ebean.Model;
import play.data.validation.Constraints;

/**
 * <p>Created on 2013-07-05 at 11:21:18 AM.</p>
 * @author 1615871 (<a href="mailto:dmitri_zakharov@ftn.fedex.com">Dmitri Zakharov</a>)
 *
 */
@Entity
public class Account extends Model {

	@Id
	public Long id;
	
	@Constraints.Required
	public String language;
	
	@Constraints.Required
	public String companyName;
}

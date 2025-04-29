package com.cloudframe.app.init1.dto;

/**
*  The class Bilrlu5f is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Bilrlu5f extends Bilrlu5fSerialized {
   
				@Getter @Setter private Rlu5fChrgCrdDtl rlu5fChrgCrdDtl = new Rlu5fChrgCrdDtl();
	
	/**
	* Constructor for Bilrlu5f
	**/
    public Bilrlu5f() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getRlu5fChrgCrdDtl().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }



	/**
	 * 	initializes Bilrlu5f
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getRlu5fChrgCrdDtl().initialize();
     
   }


}
  

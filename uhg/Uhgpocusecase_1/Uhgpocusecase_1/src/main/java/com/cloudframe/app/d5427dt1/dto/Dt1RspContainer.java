package com.cloudframe.app.d5427dt1.dto;

/**
*  The class Dt1RspContainer is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Dt1RspContainer extends Dt1RspContainerSerialized {
   
				@Getter @Setter private Dt1RspFixedArea dt1RspFixedArea = new Dt1RspFixedArea();
	
	/**
	* Constructor for Dt1RspContainer
	**/
    public Dt1RspContainer() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getDt1RspFixedArea().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }



	/**
	 * 	initializes Dt1RspContainer
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getDt1RspFixedArea().initialize();
     
   }


}
  

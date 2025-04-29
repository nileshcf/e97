package com.cloudframe.app.init1.dto;

/**
*  The class Test1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Test1 extends Test1Serialized {
   
				@Getter @Setter private Billku00NextCycEndDt billku00NextCycEndDt = new Billku00NextCycEndDt();
	
	/**
	* Constructor for Test1
	**/
    public Test1() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getBillku00NextCycEndDt().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }



	/**
	 * 	initializes Test1
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getBillku00NextCycEndDt().initialize();
     
   }


}
  

package com.cloudframe.app.move0.dto;

/**
*  The class SmallParent is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class SmallParent extends SmallParentSerialized {
   

								@Getter @Setter private char[] parent11 = Field.fillLowValue(10);
				@Getter @Setter private Parent21 parent21 = new Parent21();

								@Getter @Setter private char[] parent31 = Field.fillLowValue(10);
	
	/**
	* Constructor for SmallParent
	**/
    public SmallParent() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getParent21().setParent(this,getStartOffset() + 10);
	   	/*  end of offset */
    }



	/**
	 * 	initializes SmallParent
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                    setParent11(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_481093248,"0".toCharArray()));
          getParent21().initialize();
     
                    setParent31(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_481093248,"0".toCharArray()));
   }


}
  

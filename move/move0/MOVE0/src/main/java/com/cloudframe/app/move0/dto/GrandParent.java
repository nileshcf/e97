package com.cloudframe.app.move0.dto;

/**
*  The class GrandParent is used to handle fields declared in it
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
public class GrandParent extends GrandParentSerialized {
   

								@Getter @Setter private char[] parent1 = Field.fillLowValue(10);
				@Getter @Setter private Parent2 parent2 = new Parent2();

								@Getter @Setter private char[] parent3 = Field.fillLowValue(10);

						@Getter @Setter private char[] parent4 = Field.fillLowValue(2);
				@Getter @Setter private Parent5 parent5 = new Parent5();
	
	/**
	* Constructor for GrandParent
	**/
    public GrandParent() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getParent2().setParent(this,getStartOffset() + 10);
					getParent5().setParent(this,getStartOffset() + 23);
	   	/*  end of offset */
    }



	/**
	 * 	initializes GrandParent
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                    setParent1(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_481093248,"0".toCharArray()));
          getParent2().initialize();
     
                    setParent3(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_481093248,"0".toCharArray()));
         setParent4(CONSTANTS.SPACE_2);
          getParent5().initialize();
     
   }


}
  

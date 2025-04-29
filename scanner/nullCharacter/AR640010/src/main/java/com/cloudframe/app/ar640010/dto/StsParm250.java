package com.cloudframe.app.ar640010.dto;

/**
*  The class StsParm250 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class StsParm250 extends StsParm250Serialized {
   
				@Getter @Setter private StsInputParm250 stsInputParm250 = new StsInputParm250();
				@Getter @Setter private StsOutputParm250 stsOutputParm250 = new StsOutputParm250();
	
	/**
	* Constructor for StsParm250
	**/
    public StsParm250() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getStsInputParm250().setParent(this,getStartOffset() + 0);
					getStsOutputParm250().setParent(this,getStartOffset() + 4);
	   	/*  end of offset */
    }



	/**
	 * 	initializes StsParm250
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getStsInputParm250().initialize();
     
          getStsOutputParm250().initialize();
     
   }


}
  

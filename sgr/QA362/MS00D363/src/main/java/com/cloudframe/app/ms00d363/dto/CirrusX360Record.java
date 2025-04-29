package com.cloudframe.app.ms00d363.dto;

/**
*  The class CirrusX360Record is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class CirrusX360Record extends CirrusX360RecordSerialized {
   

						@Getter @Setter private char[] x360RecordType = Field.fillLowValue(1);
				@Getter @Setter private X360HeaderRecord x360HeaderRecord = new X360HeaderRecord();
				@Getter @Setter private X360DataRecord x360DataRecord = new X360DataRecord();
	
	/**
	* Constructor for CirrusX360Record
	**/
    public CirrusX360Record() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getX360HeaderRecord().setParent(this,getStartOffset() + 1);
					getX360DataRecord().setParent(this,getStartOffset() + 1);
	   	/*  end of offset */
    }



	/**
	 * 	initializes CirrusX360Record
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setX360RecordType(CONSTANTS.SPACE);
          getX360HeaderRecord().initialize();
     
   }


}
  

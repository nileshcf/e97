package com.cloudframe.app.vsammon4.file.records;

/**
*  The class VsvksdsRecordS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class VsvksdsRecordS extends VsvksdsRecordSSerialized {
   

								@Getter @Setter private long vskSPrimaryKey;

						@Getter @Setter private char[] vskSSysid = Field.fillLowValue(4);

								@Getter @Setter private int vskSTaskNo;

								@Getter @Setter private int vskSReqSize;

						@Getter @Setter private char[] vskSVarStruct = Field.fillLowValue(200);
	
	/**
	* Constructor for VsvksdsRecordS
	**/
    public VsvksdsRecordS() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }



	/**
	 * 	initializes VsvksdsRecordS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setVskSPrimaryKey(0);
         setVskSSysid(CONSTANTS.SPACE_4);
                     setVskSTaskNo(0);
                     setVskSReqSize(0);
         setVskSVarStruct(CONSTANTS.SPACE_200);
   }


}
  

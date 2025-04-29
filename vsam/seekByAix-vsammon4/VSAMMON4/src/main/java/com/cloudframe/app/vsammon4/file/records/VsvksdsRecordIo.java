package com.cloudframe.app.vsammon4.file.records;

/**
*  The class VsvksdsRecordIo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class VsvksdsRecordIo extends VsvksdsRecordIoSerialized {
   

								@Getter @Setter private long vskIoPrimaryKey;

						@Getter @Setter private char[] vskIoSysid = Field.fillLowValue(4);

								@Getter @Setter private int vskIoTaskNo;

								@Getter @Setter private int vskIoReqSize;

						@Getter @Setter private char[] vskIoVarStruct = Field.fillLowValue(200);
	
	/**
	* Constructor for VsvksdsRecordIo
	**/
    public VsvksdsRecordIo() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }



	/**
	 * 	initializes VsvksdsRecordIo
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setVskIoPrimaryKey(0);
         setVskIoSysid(CONSTANTS.SPACE_4);
                     setVskIoTaskNo(0);
                     setVskIoReqSize(0);
         setVskIoVarStruct(CONSTANTS.SPACE_200);
   }


}
  

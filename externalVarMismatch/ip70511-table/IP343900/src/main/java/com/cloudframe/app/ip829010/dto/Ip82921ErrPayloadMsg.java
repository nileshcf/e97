package com.cloudframe.app.ip829010.dto;

/**
*  The class Ip82921ErrPayloadMsg is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip82921ErrPayloadMsg extends Ip82921ErrPayloadMsgSerialized { 
   

								@Getter @Setter private short ip82921PayloadQueryNo;

						@Getter @Setter private char[] ip82921PayloadGftDsn = Field.fillLowValue(44);

								@Getter @Setter private int ip82921PayloadLogicalSeq;

								@Getter @Setter private int ip82921PayloadTxnNum;

								@Getter @Setter private short ip82921PayloadFacCount;

						@Getter @Setter private char[] ip82921PayloadFaaPanStat = Field.fillLowValue(1);

						@Getter @Setter private char[] ip82921PayloadFaaCloseDt = Field.fillLowValue(10);
				@Getter @Setter private Ip82921FnsDataFields ip82921FnsDataFields = new Ip82921FnsDataFields();
	
	/**
	* Constructor for Ip82921ErrPayloadMsg
	**/
    public Ip82921ErrPayloadMsg() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip82921ErrPayloadMsg. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip82921ErrPayloadMsg(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp82921FnsDataFields().setParent(this,getStartOffset() + 68);
    } 

	/**
	 * 	initializes Ip82921ErrPayloadMsg
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         	setIp82921PayloadQueryNo((short)0);
         setIp82921PayloadGftDsn(CONSTANTS.SPACE_44);
                     setIp82921PayloadLogicalSeq(0);
                     setIp82921PayloadTxnNum(0);
         	setIp82921PayloadFacCount((short)0);
         setIp82921PayloadFaaPanStat(CONSTANTS.SPACE);
         setIp82921PayloadFaaCloseDt(CONSTANTS.SPACE_10);
          getIp82921FnsDataFields().initialize();
     
   }


}
  

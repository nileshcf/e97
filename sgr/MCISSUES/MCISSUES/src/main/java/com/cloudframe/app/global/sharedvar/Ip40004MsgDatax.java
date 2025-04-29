package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip40004MsgDatax is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip40004MsgDatax extends Ip40004MsgDataxSerialized { 
   

						@Getter @Setter private char[] ip40004RecType = Field.fillLowValue(1);

								@Getter @Setter private int ip40004DtlFileSeqNbr;

						@Getter @Setter private char[] ip40004CollOnlyInd = Field.fillLowValue(1);

								@Getter @Setter private long ip40004SourceMsgNum;

								@Getter @Setter private long ip40004TransAmount;

						@Getter @Setter private char[] ip40004TransDbCrInd = Field.fillLowValue(2);

								@Getter @Setter private int ip40004ErrorMsgNbr;
				@Getter @Setter private Ip40004FinStatRec ip40004FinStatRec = new Ip40004FinStatRec();
	
	/**
	* Constructor for Ip40004MsgDatax
	**/
    public Ip40004MsgDatax() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip40004MsgDatax. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip40004MsgDatax(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp40004FinStatRec().setParent(this,getStartOffset() + 35);
    } 

	/**
	 * 	initializes Ip40004MsgDatax
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp40004RecType(CONSTANTS.SPACE);
                     setIp40004DtlFileSeqNbr(0);
         setIp40004CollOnlyInd(CONSTANTS.SPACE);
                     setIp40004SourceMsgNum(0);
                     setIp40004TransAmount(0);
         setIp40004TransDbCrInd(CONSTANTS.SPACE_2);
                     setIp40004ErrorMsgNbr(0);
          getIp40004FinStatRec().initialize();
     
   }


}
  

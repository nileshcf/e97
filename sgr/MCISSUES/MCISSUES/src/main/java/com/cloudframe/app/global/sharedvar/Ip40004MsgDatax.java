package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip40004MsgDatax is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip40004MsgDatax extends Ip40004MsgDataxSerialized { 
   

						private char[] ip40004RecType = Field.fillLowValue(1);

								private int ip40004DtlFileSeqNbr;

						private char[] ip40004CollOnlyInd = Field.fillLowValue(1);

								private long ip40004SourceMsgNum;

								private long ip40004TransAmount;

						private char[] ip40004TransDbCrInd = Field.fillLowValue(2);

								private int ip40004ErrorMsgNbr;
				private Ip40004FinStatRec ip40004FinStatRec = new Ip40004FinStatRec();
	
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
	       			ip40004FinStatRec.setParent(this,getStartOffset() + 35);
    } 

	/**
	 *	Returns the value of ip40004RecType
	 *	@return ip40004RecType
	 */
   public char[] getIp40004RecType() throws CFException{
     if (isIp40004RecTypeModified()) { 
        ip40004RecType = refreshIp40004RecType();
     }
   		return ip40004RecType;
   }

  
	/**
	*  set variable ip40004RecType
	*  Corresponding COBOL Variable is IP40004-REC-TYPE
	*  @param value
	**/
   public void setIp40004RecType(char[] value) {
      ip40004RecType = checkIp40004RecTypeConstraints(value);
      serializeIp40004RecType(ip40004RecType);
   } 

     /**
	 * 	Update Ip40004RecType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp40004RecType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp40004RecType,ip40004RecType.length);
   	
   }
   
   public void setIp40004RecType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004RecType,ip40004RecType.length);
   	
   }
   
     /**
	 * 	Update Ip40004RecType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp40004RecType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004RecType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip40004RecType with another Field
	 *	@param value
	 */
   public void setIp40004RecType(Field source) {
       replace(source,0,source.length(),beginIp40004RecType,IP_40004_REC_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update Ip40004RecType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp40004RecType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp40004RecType,IP_40004_REC_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update Ip40004RecType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp40004RecType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004RecType+targetIndex,targetLen);
    
   }
	char[] ip40004MessageDetail8888Value = "D".toCharArray();
	/**
	 *	Test condition "D" for isIp40004MessageDetail88()
	 *	@return  Returns true if isIp40004MessageDetail88() is "D"
	 */
   public boolean isIp40004MessageDetail88() throws CFException {
      return (  compareChars( getIp40004RecType() , ip40004MessageDetail8888Value)  == 0  );
   }


	/**
	*  set values "D"
	*/
   	public void setIp40004MessageDetail88True() {  			
    	setIp40004RecType( ip40004MessageDetail8888Value);
   	}
	char[] ip40004HeaderMessage8888Value = "H".toCharArray();
	/**
	 *	Test condition "H" for isIp40004HeaderMessage88()
	 *	@return  Returns true if isIp40004HeaderMessage88() is "H"
	 */
   public boolean isIp40004HeaderMessage88() throws CFException {
      return (  compareChars( getIp40004RecType() , ip40004HeaderMessage8888Value)  == 0  );
   }


	/**
	*  set values "H"
	*/
   	public void setIp40004HeaderMessage88True() {  			
    	setIp40004RecType( ip40004HeaderMessage8888Value);
   	}
	char[] ip40004TrailerMessage8888Value = "T".toCharArray();
	/**
	 *	Test condition "T" for isIp40004TrailerMessage88()
	 *	@return  Returns true if isIp40004TrailerMessage88() is "T"
	 */
   public boolean isIp40004TrailerMessage88() throws CFException {
      return (  compareChars( getIp40004RecType() , ip40004TrailerMessage8888Value)  == 0  );
   }


	/**
	*  set values "T"
	*/
   	public void setIp40004TrailerMessage88True() {  			
    	setIp40004RecType( ip40004TrailerMessage8888Value);
   	}
	static java.util.Set<String> ip40004AdminFileErr8888Value = new java.util.HashSet<>();
static { 
	ip40004AdminFileErr8888Value.add( "1");
	ip40004AdminFileErr8888Value.add( "2");
	ip40004AdminFileErr8888Value.add( "3");
	ip40004AdminFileErr8888Value.add( "4");
	ip40004AdminFileErr8888Value.add( "5");
	ip40004AdminFileErr8888Value.add( "6");
	ip40004AdminFileErr8888Value.add( "7");
	ip40004AdminFileErr8888Value.add( "8");
} 

	/**
	 *	Test condition "1" "2" "3" "4" "5" "6" "7" "8" for isIp40004AdminFileErr88()
	 *	@return  Returns true if isIp40004AdminFileErr88() is "1" "2" "3" "4" "5" "6" "7" "8"
	 */
   public boolean isIp40004AdminFileErr88() throws CFException {
      return   ip40004AdminFileErr8888Value.contains(String.valueOf(getIp40004RecType()));
   }


	/**
	*  set values "1" "2" "3" "4" "5" "6" "7" "8"
	*/
   	public void setIp40004AdminFileErr88True() {  			
    	  setIp40004RecType(ip40004AdminFileErr8888Value.iterator().next().toCharArray());
   	}
	static java.util.Set<String> ip40004NeedAdmin16446998888Value = new java.util.HashSet<>();
static { 
	ip40004NeedAdmin16446998888Value.add( "2");
	ip40004NeedAdmin16446998888Value.add( "3");
	ip40004NeedAdmin16446998888Value.add( "4");
	ip40004NeedAdmin16446998888Value.add( "5");
	ip40004NeedAdmin16446998888Value.add( "6");
	ip40004NeedAdmin16446998888Value.add( "8");
} 

	/**
	 *	Test condition "2" "3" "4" "5" "6" "8" for isIp40004NeedAdmin164469988()
	 *	@return  Returns true if isIp40004NeedAdmin164469988() is "2" "3" "4" "5" "6" "8"
	 */
   public boolean isIp40004NeedAdmin164469988() throws CFException {
      return   ip40004NeedAdmin16446998888Value.contains(String.valueOf(getIp40004RecType()));
   }


	/**
	*  set values "2" "3" "4" "5" "6" "8"
	*/
   	public void setIp40004NeedAdmin164469988True() {  			
    	  setIp40004RecType(ip40004NeedAdmin16446998888Value.iterator().next().toCharArray());
   	}
	char[] ip40004AdminMsgErr8888Value = "M".toCharArray();
	/**
	 *	Test condition "M" for isIp40004AdminMsgErr88()
	 *	@return  Returns true if isIp40004AdminMsgErr88() is "M"
	 */
   public boolean isIp40004AdminMsgErr88() throws CFException {
      return (  compareChars( getIp40004RecType() , ip40004AdminMsgErr8888Value)  == 0  );
   }


	/**
	*  set values "M"
	*/
   	public void setIp40004AdminMsgErr88True() {  			
    	setIp40004RecType( ip40004AdminMsgErr8888Value);
   	}
	char[] ip40004AdminUnpErr8888Value = "U".toCharArray();
	/**
	 *	Test condition "U" for isIp40004AdminUnpErr88()
	 *	@return  Returns true if isIp40004AdminUnpErr88() is "U"
	 */
   public boolean isIp40004AdminUnpErr88() throws CFException {
      return (  compareChars( getIp40004RecType() , ip40004AdminUnpErr8888Value)  == 0  );
   }


	/**
	*  set values "U"
	*/
   	public void setIp40004AdminUnpErr88True() {  			
    	setIp40004RecType( ip40004AdminUnpErr8888Value);
   	}
	char[] ip40004AdminMissHdr8888Value = "1".toCharArray();
	/**
	 *	Test condition "1" for isIp40004AdminMissHdr88()
	 *	@return  Returns true if isIp40004AdminMissHdr88() is "1"
	 */
   public boolean isIp40004AdminMissHdr88() throws CFException {
      return (  compareChars( getIp40004RecType() , ip40004AdminMissHdr8888Value)  == 0  );
   }


	/**
	*  set values "1"
	*/
   	public void setIp40004AdminMissHdr88True() {  			
    	setIp40004RecType( ip40004AdminMissHdr8888Value);
   	}
	char[] ip40004AdminMissTrlr8888Value = "2".toCharArray();
	/**
	 *	Test condition "2" for isIp40004AdminMissTrlr88()
	 *	@return  Returns true if isIp40004AdminMissTrlr88() is "2"
	 */
   public boolean isIp40004AdminMissTrlr88() throws CFException {
      return (  compareChars( getIp40004RecType() , ip40004AdminMissTrlr8888Value)  == 0  );
   }


	/**
	*  set values "2"
	*/
   	public void setIp40004AdminMissTrlr88True() {  			
    	setIp40004RecType( ip40004AdminMissTrlr8888Value);
   	}
	char[] ip40004AdminNoDetail8888Value = "3".toCharArray();
	/**
	 *	Test condition "3" for isIp40004AdminNoDetail88()
	 *	@return  Returns true if isIp40004AdminNoDetail88() is "3"
	 */
   public boolean isIp40004AdminNoDetail88() throws CFException {
      return (  compareChars( getIp40004RecType() , ip40004AdminNoDetail8888Value)  == 0  );
   }


	/**
	*  set values "3"
	*/
   	public void setIp40004AdminNoDetail88True() {  			
    	setIp40004RecType( ip40004AdminNoDetail8888Value);
   	}
	char[] ip40004AdminAllDetRej8888Value = "4".toCharArray();
	/**
	 *	Test condition "4" for isIp40004AdminAllDetRej88()
	 *	@return  Returns true if isIp40004AdminAllDetRej88() is "4"
	 */
   public boolean isIp40004AdminAllDetRej88() throws CFException {
      return (  compareChars( getIp40004RecType() , ip40004AdminAllDetRej8888Value)  == 0  );
   }


	/**
	*  set values "4"
	*/
   	public void setIp40004AdminAllDetRej88True() {  			
    	setIp40004RecType( ip40004AdminAllDetRej8888Value);
   	}
	char[] ip40004AdminThreshRej8888Value = "5".toCharArray();
	/**
	 *	Test condition "5" for isIp40004AdminThreshRej88()
	 *	@return  Returns true if isIp40004AdminThreshRej88() is "5"
	 */
   public boolean isIp40004AdminThreshRej88() throws CFException {
      return (  compareChars( getIp40004RecType() , ip40004AdminThreshRej8888Value)  == 0  );
   }


	/**
	*  set values "5"
	*/
   	public void setIp40004AdminThreshRej88True() {  			
    	setIp40004RecType( ip40004AdminThreshRej8888Value);
   	}
	char[] ip40004AdminTrlCntOff8888Value = "6".toCharArray();
	/**
	 *	Test condition "6" for isIp40004AdminTrlCntOff88()
	 *	@return  Returns true if isIp40004AdminTrlCntOff88() is "6"
	 */
   public boolean isIp40004AdminTrlCntOff88() throws CFException {
      return (  compareChars( getIp40004RecType() , ip40004AdminTrlCntOff8888Value)  == 0  );
   }


	/**
	*  set values "6"
	*/
   	public void setIp40004AdminTrlCntOff88True() {  			
    	setIp40004RecType( ip40004AdminTrlCntOff8888Value);
   	}
	char[] ip40004AdminHdrErrors8888Value = "7".toCharArray();
	/**
	 *	Test condition "7" for isIp40004AdminHdrErrors88()
	 *	@return  Returns true if isIp40004AdminHdrErrors88() is "7"
	 */
   public boolean isIp40004AdminHdrErrors88() throws CFException {
      return (  compareChars( getIp40004RecType() , ip40004AdminHdrErrors8888Value)  == 0  );
   }


	/**
	*  set values "7"
	*/
   	public void setIp40004AdminHdrErrors88True() {  			
    	setIp40004RecType( ip40004AdminHdrErrors8888Value);
   	}
	char[] ip40004AdminTrlErrors8888Value = "8".toCharArray();
	/**
	 *	Test condition "8" for isIp40004AdminTrlErrors88()
	 *	@return  Returns true if isIp40004AdminTrlErrors88() is "8"
	 */
   public boolean isIp40004AdminTrlErrors88() throws CFException {
      return (  compareChars( getIp40004RecType() , ip40004AdminTrlErrors8888Value)  == 0  );
   }


	/**
	*  set values "8"
	*/
   	public void setIp40004AdminTrlErrors88True() {  			
    	setIp40004RecType( ip40004AdminTrlErrors8888Value);
   	}
	/**
	 *	Returns the value of ip40004DtlFileSeqNbr
	 *	@return ip40004DtlFileSeqNbr
	 */
	public int getIp40004DtlFileSeqNbr() throws CFException {
       if (isIp40004DtlFileSeqNbrModified()) { 
           ip40004DtlFileSeqNbr = refreshIp40004DtlFileSeqNbr();
        }
   		return ip40004DtlFileSeqNbr;
	}
	

	
	   
	/**
	 * 	Update Ip40004DtlFileSeqNbr with the passed value
	 *  Corresponding COBOL Variable is IP40004-DTL-FILE-SEQ-NBR
	 *	@param number
	 */
	public void setIp40004DtlFileSeqNbr(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip40004DtlFileSeqNbr = checkIp40004DtlFileSeqNbrMaxLimit(number); 
		serializeIp40004DtlFileSeqNbr(ip40004DtlFileSeqNbr);
	}
	

	public void setIp40004DtlFileSeqNbr(long number) {
	    number = checkIp40004DtlFileSeqNbrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp40004DtlFileSeqNbr((int)number);
	}
	
	/**
	 * 	Update Ip40004DtlFileSeqNbr with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp40004DtlFileSeqNbr(char[] value) throws CFException {
		 ip40004DtlFileSeqNbr = serializeIp40004DtlFileSeqNbr(value);
	}
	/**
	 * 	Update Ip40004DtlFileSeqNbr with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp40004DtlFileSeqNbrString(char[] value) throws CFException {
		 setIp40004DtlFileSeqNbr(value);
	}
	/**
	 *	Returns the value of ip40004CollOnlyInd
	 *	@return ip40004CollOnlyInd
	 */
   public char[] getIp40004CollOnlyInd() throws CFException{
     if (isIp40004CollOnlyIndModified()) { 
        ip40004CollOnlyInd = refreshIp40004CollOnlyInd();
     }
   		return ip40004CollOnlyInd;
   }

  
	/**
	*  set variable ip40004CollOnlyInd
	*  Corresponding COBOL Variable is IP40004-COLL-ONLY-IND
	*  @param value
	**/
   public void setIp40004CollOnlyInd(char[] value) {
      ip40004CollOnlyInd = checkIp40004CollOnlyIndConstraints(value);
      serializeIp40004CollOnlyInd(ip40004CollOnlyInd);
   } 

     /**
	 * 	Update Ip40004CollOnlyInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp40004CollOnlyInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp40004CollOnlyInd,ip40004CollOnlyInd.length);
   	
   }
   
   public void setIp40004CollOnlyInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004CollOnlyInd,ip40004CollOnlyInd.length);
   	
   }
   
     /**
	 * 	Update Ip40004CollOnlyInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp40004CollOnlyInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004CollOnlyInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip40004CollOnlyInd with another Field
	 *	@param value
	 */
   public void setIp40004CollOnlyInd(Field source) {
       replace(source,0,source.length(),beginIp40004CollOnlyInd,IP_40004_COLL_ONLY_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip40004CollOnlyInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp40004CollOnlyInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp40004CollOnlyInd,IP_40004_COLL_ONLY_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip40004CollOnlyInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp40004CollOnlyInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004CollOnlyInd+targetIndex,targetLen);
    
   }
	char[] ip40004CollOnlyMsg8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp40004CollOnlyMsg88()
	 *	@return  Returns true if isIp40004CollOnlyMsg88() is "Y"
	 */
   public boolean isIp40004CollOnlyMsg88() throws CFException {
      return (  compareChars( getIp40004CollOnlyInd() , ip40004CollOnlyMsg8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp40004CollOnlyMsg88True() {  			
    	setIp40004CollOnlyInd( ip40004CollOnlyMsg8888Value);
   	}
	char[] ip40004NonCollOnlyMsg8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp40004NonCollOnlyMsg88()
	 *	@return  Returns true if isIp40004NonCollOnlyMsg88() is "N"
	 */
   public boolean isIp40004NonCollOnlyMsg88() throws CFException {
      return (  compareChars( getIp40004CollOnlyInd() , ip40004NonCollOnlyMsg8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp40004NonCollOnlyMsg88True() {  			
    	setIp40004CollOnlyInd( ip40004NonCollOnlyMsg8888Value);
   	}
	/**
	 *	Returns the value of ip40004SourceMsgNum
	 *	@return ip40004SourceMsgNum
	 */
	public long getIp40004SourceMsgNum() throws CFException {
       if (isIp40004SourceMsgNumModified()) { 
           ip40004SourceMsgNum = refreshIp40004SourceMsgNum();
        }
   		return ip40004SourceMsgNum;
	}
	

	
	   
	/**
	 * 	Update Ip40004SourceMsgNum with the passed value
	 *  Corresponding COBOL Variable is IP40004-SOURCE-MSG-NUM
	 *	@param number
	 */
	public void setIp40004SourceMsgNum(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip40004SourceMsgNum = checkIp40004SourceMsgNumMaxLimit(number); 
		serializeIp40004SourceMsgNum(ip40004SourceMsgNum);
	}
	

	/**
	 * 	Update Ip40004SourceMsgNum with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp40004SourceMsgNum(char[] value) throws CFException {
		 ip40004SourceMsgNum = serializeIp40004SourceMsgNum(value);
	}
	/**
	 * 	Update Ip40004SourceMsgNum with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp40004SourceMsgNumString(char[] value) throws CFException {
		 setIp40004SourceMsgNum(value);
	}
	/**
	 *	Returns the value of ip40004TransAmount
	 *	@return ip40004TransAmount
	 */
	public long getIp40004TransAmount() throws CFException {
       if (isIp40004TransAmountModified()) { 
           ip40004TransAmount = refreshIp40004TransAmount();
        }
   		return ip40004TransAmount;
	}
	

	
	   
	/**
	 * 	Update Ip40004TransAmount with the passed value
	 *  Corresponding COBOL Variable is IP40004-TRANS-AMOUNT
	 *	@param number
	 */
	public void setIp40004TransAmount(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip40004TransAmount = checkIp40004TransAmountMaxLimit(number); 
		serializeIp40004TransAmount(ip40004TransAmount);
	}
	

	/**
	 * 	Update Ip40004TransAmount with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp40004TransAmount(char[] value) throws CFException {
		 ip40004TransAmount = serializeIp40004TransAmount(value);
	}
	/**
	 * 	Update Ip40004TransAmount with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp40004TransAmountString(char[] value) throws CFException {
		 setIp40004TransAmount(value);
	}
	/**
	 *	Returns the value of ip40004TransDbCrInd
	 *	@return ip40004TransDbCrInd
	 */
   public char[] getIp40004TransDbCrInd() throws CFException{
     if (isIp40004TransDbCrIndModified()) { 
        ip40004TransDbCrInd = refreshIp40004TransDbCrInd();
     }
   		return ip40004TransDbCrInd;
   }

  
	/**
	*  set variable ip40004TransDbCrInd
	*  Corresponding COBOL Variable is IP40004-TRANS-DB-CR-IND
	*  @param value
	**/
   public void setIp40004TransDbCrInd(char[] value) {
      ip40004TransDbCrInd = checkIp40004TransDbCrIndConstraints(value);
      serializeIp40004TransDbCrInd(ip40004TransDbCrInd);
   } 

     /**
	 * 	Update Ip40004TransDbCrInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp40004TransDbCrInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp40004TransDbCrInd,ip40004TransDbCrInd.length);
   	
   }
   
   public void setIp40004TransDbCrInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004TransDbCrInd,ip40004TransDbCrInd.length);
   	
   }
   
     /**
	 * 	Update Ip40004TransDbCrInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp40004TransDbCrInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004TransDbCrInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip40004TransDbCrInd with another Field
	 *	@param value
	 */
   public void setIp40004TransDbCrInd(Field source) {
       replace(source,0,source.length(),beginIp40004TransDbCrInd,IP_40004_TRANS_DB_CR_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip40004TransDbCrInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp40004TransDbCrInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp40004TransDbCrInd,IP_40004_TRANS_DB_CR_IND_LEN);
   	
   }
   
     /**
	 * 	Update Ip40004TransDbCrInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp40004TransDbCrInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp40004TransDbCrInd+targetIndex,targetLen);
    
   }
	char[] ip40004TransDebit8888Value = "DR".toCharArray();
	/**
	 *	Test condition "DR" for isIp40004TransDebit88()
	 *	@return  Returns true if isIp40004TransDebit88() is "DR"
	 */
   public boolean isIp40004TransDebit88() throws CFException {
      return (  compareChars( getIp40004TransDbCrInd() , ip40004TransDebit8888Value)  == 0  );
   }


	/**
	*  set values "DR"
	*/
   	public void setIp40004TransDebit88True() {  			
    	setIp40004TransDbCrInd( ip40004TransDebit8888Value);
   	}
	char[] ip40004TransCredit8888Value = "CR".toCharArray();
	/**
	 *	Test condition "CR" for isIp40004TransCredit88()
	 *	@return  Returns true if isIp40004TransCredit88() is "CR"
	 */
   public boolean isIp40004TransCredit88() throws CFException {
      return (  compareChars( getIp40004TransDbCrInd() , ip40004TransCredit8888Value)  == 0  );
   }


	/**
	*  set values "CR"
	*/
   	public void setIp40004TransCredit88True() {  			
    	setIp40004TransDbCrInd( ip40004TransCredit8888Value);
   	}
	/**
	 *	Returns the value of ip40004ErrorMsgNbr
	 *	@return ip40004ErrorMsgNbr
	 */
	public int getIp40004ErrorMsgNbr() throws CFException {
       if (isIp40004ErrorMsgNbrModified()) { 
           ip40004ErrorMsgNbr = refreshIp40004ErrorMsgNbr();
        }
   		return ip40004ErrorMsgNbr;
	}
	

	
	   
	/**
	 * 	Update Ip40004ErrorMsgNbr with the passed value
	 *  Corresponding COBOL Variable is IP40004-ERROR-MSG-NBR
	 *	@param number
	 */
	public void setIp40004ErrorMsgNbr(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip40004ErrorMsgNbr = checkIp40004ErrorMsgNbrMaxLimit(number); 
		serializeIp40004ErrorMsgNbr(ip40004ErrorMsgNbr);
	}
	

	public void setIp40004ErrorMsgNbr(long number) {
	    number = checkIp40004ErrorMsgNbrMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp40004ErrorMsgNbr((int)number);
	}
	
	/**
	 * 	Update Ip40004ErrorMsgNbr with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp40004ErrorMsgNbr(char[] value) throws CFException {
		 ip40004ErrorMsgNbr = serializeIp40004ErrorMsgNbr(value);
	}
	/**
	 * 	Update Ip40004ErrorMsgNbr with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp40004ErrorMsgNbrString(char[] value) throws CFException {
		 setIp40004ErrorMsgNbr(value);
	}
	/**
	 *	Returns the value of ip40004FinStatRec
	 *	@return ip40004FinStatRec
	 */   
	 public Ip40004FinStatRec getIp40004FinStatRec() {
   	return ip40004FinStatRec;
   }
   /**
	* 	Update Ip40004FinStatRec with the passed value
	*   Corresponding COBOL Variable is IP40004-FIN-STAT-REC
	*	@param value
	*/
   public void setIp40004FinStatRec(char[] value) {
      ip40004FinStatRec.setString(value); 
   }   
    
     /**
	 * 	Update Ip40004FinStatRec 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp40004FinStatRec(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip40004FinStatRec.begin,ip40004FinStatRec.length());
   }
   
     /**
	 * 	Update Ip40004FinStatRec 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp40004FinStatRec(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip40004FinStatRec.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip40004FinStatRec with another Field
	 *	@param value
	 */
   public void setIp40004FinStatRec(Field source) {
   	replace(source,0,source.length(),ip40004FinStatRec.begin,ip40004FinStatRec.length());
   }  
   
     /**
	 * 	Update Ip40004FinStatRec 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp40004FinStatRec(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip40004FinStatRec.begin,ip40004FinStatRec.length());
   }
   
     /**
	 * 	Update Ip40004FinStatRec 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp40004FinStatRec(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip40004FinStatRec.begin+targetIndex,targetLen);
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
          ip40004FinStatRec.initialize();
     
   }

		public static int getIp40004MsgDataxFieldLength() {
			return IP_40004_MSG_DATAX_LENGTH;
		}

}
  

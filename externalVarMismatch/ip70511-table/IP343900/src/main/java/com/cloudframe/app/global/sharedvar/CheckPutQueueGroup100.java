package com.cloudframe.app.global.sharedvar;

/**
*  The class CheckPutQueueGroup100 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_checkPutQueueGroup100")

public class CheckPutQueueGroup100 extends CheckPutQueueGroup100Serialized  implements InitializingBean {
   

						private char[] checkPutQueue100 = Field.fillLowValue(1);
	
	/**
	* Constructor for CheckPutQueueGroup100
	**/
    public CheckPutQueueGroup100() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of checkPutQueue100
	 *	@return checkPutQueue100
	 */
   public char[] getCheckPutQueue100() throws CFException{
     if (isCheckPutQueue100Modified()) { 
        checkPutQueue100 = refreshCheckPutQueue100();
     }
   		return checkPutQueue100;
   }

  
	/**
	*  set variable checkPutQueue100
	*  Corresponding COBOL Variable is 100-CHECK-PUT-QUEUE
	*  @param value
	**/
   public void setCheckPutQueue100(char[] value) {
      checkPutQueue100 = checkCheckPutQueue100Constraints(value);
      serializeCheckPutQueue100(checkPutQueue100);
   } 

     /**
	 * 	Update CheckPutQueue100 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCheckPutQueue100(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCheckPutQueue100,checkPutQueue100.length);
   	
   }
   
   public void setCheckPutQueue100(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCheckPutQueue100,checkPutQueue100.length);
   	
   }
   
     /**
	 * 	Update CheckPutQueue100 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCheckPutQueue100(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCheckPutQueue100+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CheckPutQueue100 with another Field
	 *	@param value
	 */
   public void setCheckPutQueue100(Field source) {
       replace(source,0,source.length(),beginCheckPutQueue100,CHECK_PUT_QUEUE_100_LEN);
   	
   }  
   
     /**
	 * 	Update CheckPutQueue100 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCheckPutQueue100(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCheckPutQueue100,CHECK_PUT_QUEUE_100_LEN);
   	
   }
   
     /**
	 * 	Update CheckPutQueue100 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCheckPutQueue100(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCheckPutQueue100+targetIndex,targetLen);
    
   }
	char[] putPmaAms8810088Value = fillZeroes(1);
	/**
	 *	Test condition "0" for isPutPmaAms88100()
	 *	@return  Returns true if isPutPmaAms88100() is "0"
	 */
   public boolean isPutPmaAms88100() throws CFException {
      return (  compareChars( getCheckPutQueue100() , putPmaAms8810088Value)  == 0  );
   }


	/**
	*  set values "0"
	*/
   	public void setPutPmaAms88100True() {  			
    	setCheckPutQueue100( putPmaAms8810088Value);
   	}
	char[] putPmiAms8810088Value = "1".toCharArray();
	/**
	 *	Test condition "1" for isPutPmiAms88100()
	 *	@return  Returns true if isPutPmiAms88100() is "1"
	 */
   public boolean isPutPmiAms88100() throws CFException {
      return (  compareChars( getCheckPutQueue100() , putPmiAms8810088Value)  == 0  );
   }


	/**
	*  set values "1"
	*/
   	public void setPutPmiAms88100True() {  			
    	setCheckPutQueue100( putPmiAms8810088Value);
   	}
	char[] putPimAms8810088Value = "2".toCharArray();
	/**
	 *	Test condition "2" for isPutPimAms88100()
	 *	@return  Returns true if isPutPimAms88100() is "2"
	 */
   public boolean isPutPimAms88100() throws CFException {
      return (  compareChars( getCheckPutQueue100() , putPimAms8810088Value)  == 0  );
   }


	/**
	*  set values "2"
	*/
   	public void setPutPimAms88100True() {  			
    	setCheckPutQueue100( putPimAms8810088Value);
   	}
	char[] putPmaRus8810088Value = "3".toCharArray();
	/**
	 *	Test condition "3" for isPutPmaRus88100()
	 *	@return  Returns true if isPutPmaRus88100() is "3"
	 */
   public boolean isPutPmaRus88100() throws CFException {
      return (  compareChars( getCheckPutQueue100() , putPmaRus8810088Value)  == 0  );
   }


	/**
	*  set values "3"
	*/
   	public void setPutPmaRus88100True() {  			
    	setCheckPutQueue100( putPmaRus8810088Value);
   	}
	char[] putPmaIdn8810088Value = "4".toCharArray();
	/**
	 *	Test condition "4" for isPutPmaIdn88100()
	 *	@return  Returns true if isPutPmaIdn88100() is "4"
	 */
   public boolean isPutPmaIdn88100() throws CFException {
      return (  compareChars( getCheckPutQueue100() , putPmaIdn8810088Value)  == 0  );
   }


	/**
	*  set values "4"
	*/
   	public void setPutPmaIdn88100True() {  			
    	setCheckPutQueue100( putPmaIdn8810088Value);
   	}
	char[] putPmiRus8810088Value = "5".toCharArray();
	/**
	 *	Test condition "5" for isPutPmiRus88100()
	 *	@return  Returns true if isPutPmiRus88100() is "5"
	 */
   public boolean isPutPmiRus88100() throws CFException {
      return (  compareChars( getCheckPutQueue100() , putPmiRus8810088Value)  == 0  );
   }


	/**
	*  set values "5"
	*/
   	public void setPutPmiRus88100True() {  			
    	setCheckPutQueue100( putPmiRus8810088Value);
   	}
	char[] putPmiIdn8810088Value = "6".toCharArray();
	/**
	 *	Test condition "6" for isPutPmiIdn88100()
	 *	@return  Returns true if isPutPmiIdn88100() is "6"
	 */
   public boolean isPutPmiIdn88100() throws CFException {
      return (  compareChars( getCheckPutQueue100() , putPmiIdn8810088Value)  == 0  );
   }


	/**
	*  set values "6"
	*/
   	public void setPutPmiIdn88100True() {  			
    	setCheckPutQueue100( putPmiIdn8810088Value);
   	}
	char[] putPimRus8810088Value = "7".toCharArray();
	/**
	 *	Test condition "7" for isPutPimRus88100()
	 *	@return  Returns true if isPutPimRus88100() is "7"
	 */
   public boolean isPutPimRus88100() throws CFException {
      return (  compareChars( getCheckPutQueue100() , putPimRus8810088Value)  == 0  );
   }


	/**
	*  set values "7"
	*/
   	public void setPutPimRus88100True() {  			
    	setCheckPutQueue100( putPimRus8810088Value);
   	}
	char[] putPimIdn8810088Value = "8".toCharArray();
	/**
	 *	Test condition "8" for isPutPimIdn88100()
	 *	@return  Returns true if isPutPimIdn88100() is "8"
	 */
   public boolean isPutPimIdn88100() throws CFException {
      return (  compareChars( getCheckPutQueue100() , putPimIdn8810088Value)  == 0  );
   }


	/**
	*  set values "8"
	*/
   	public void setPutPimIdn88100True() {  			
    	setCheckPutQueue100( putPimIdn8810088Value);
   	}
	char[] putPmtIdn8810088Value = "9".toCharArray();
	/**
	 *	Test condition "9" for isPutPmtIdn88100()
	 *	@return  Returns true if isPutPmtIdn88100() is "9"
	 */
   public boolean isPutPmtIdn88100() throws CFException {
      return (  compareChars( getCheckPutQueue100() , putPmtIdn8810088Value)  == 0  );
   }


	/**
	*  set values "9"
	*/
   	public void setPutPmtIdn88100True() {  			
    	setCheckPutQueue100( putPmtIdn8810088Value);
   	}
	char[] putPmtRus8810088Value = "A".toCharArray();
	/**
	 *	Test condition "A" for isPutPmtRus88100()
	 *	@return  Returns true if isPutPmtRus88100() is "A"
	 */
   public boolean isPutPmtRus88100() throws CFException {
      return (  compareChars( getCheckPutQueue100() , putPmtRus8810088Value)  == 0  );
   }


	/**
	*  set values "A"
	*/
   	public void setPutPmtRus88100True() {  			
    	setCheckPutQueue100( putPmtRus8810088Value);
   	}
	char[] putCaq28810088Value = "B".toCharArray();
	/**
	 *	Test condition "B" for isPutCaq288100()
	 *	@return  Returns true if isPutCaq288100() is "B"
	 */
   public boolean isPutCaq288100() throws CFException {
      return (  compareChars( getCheckPutQueue100() , putCaq28810088Value)  == 0  );
   }


	/**
	*  set values "B"
	*/
   	public void setPutCaq288100True() {  			
    	setCheckPutQueue100( putCaq28810088Value);
   	}
	char[] putFaaFac28810088Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isPutFaaFac288100()
	 *	@return  Returns true if isPutFaaFac288100() is "C"
	 */
   public boolean isPutFaaFac288100() throws CFException {
      return (  compareChars( getCheckPutQueue100() , putFaaFac28810088Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setPutFaaFac288100True() {  			
    	setCheckPutQueue100( putFaaFac28810088Value);
   	}
	char[] putQrRefund28810088Value = "D".toCharArray();
	/**
	 *	Test condition "D" for isPutQrRefund288100()
	 *	@return  Returns true if isPutQrRefund288100() is "D"
	 */
   public boolean isPutQrRefund288100() throws CFException {
      return (  compareChars( getCheckPutQueue100() , putQrRefund28810088Value)  == 0  );
   }


	/**
	*  set values "D"
	*/
   	public void setPutQrRefund288100True() {  			
    	setCheckPutQueue100( putQrRefund28810088Value);
   	}
	char[] putMpAch28810088Value = "E".toCharArray();
	/**
	 *	Test condition "E" for isPutMpAch288100()
	 *	@return  Returns true if isPutMpAch288100() is "E"
	 */
   public boolean isPutMpAch288100() throws CFException {
      return (  compareChars( getCheckPutQueue100() , putMpAch28810088Value)  == 0  );
   }


	/**
	*  set values "E"
	*/
   	public void setPutMpAch288100True() {  			
    	setCheckPutQueue100( putMpAch28810088Value);
   	}
	char[] putCaq18810088Value = "F".toCharArray();
	/**
	 *	Test condition "F" for isPutCaq188100()
	 *	@return  Returns true if isPutCaq188100() is "F"
	 */
   public boolean isPutCaq188100() throws CFException {
      return (  compareChars( getCheckPutQueue100() , putCaq18810088Value)  == 0  );
   }


	/**
	*  set values "F"
	*/
   	public void setPutCaq188100True() {  			
    	setCheckPutQueue100( putCaq18810088Value);
   	}
	char[] putCmq8810088Value = "G".toCharArray();
	/**
	 *	Test condition "G" for isPutCmq88100()
	 *	@return  Returns true if isPutCmq88100() is "G"
	 */
   public boolean isPutCmq88100() throws CFException {
      return (  compareChars( getCheckPutQueue100() , putCmq8810088Value)  == 0  );
   }


	/**
	*  set values "G"
	*/
   	public void setPutCmq88100True() {  			
    	setCheckPutQueue100( putCmq8810088Value);
   	}
	char[] putFaaFac18810088Value = "H".toCharArray();
	/**
	 *	Test condition "H" for isPutFaaFac188100()
	 *	@return  Returns true if isPutFaaFac188100() is "H"
	 */
   public boolean isPutFaaFac188100() throws CFException {
      return (  compareChars( getCheckPutQueue100() , putFaaFac18810088Value)  == 0  );
   }


	/**
	*  set values "H"
	*/
   	public void setPutFaaFac188100True() {  			
    	setCheckPutQueue100( putFaaFac18810088Value);
   	}
	char[] putMpAch18810088Value = "I".toCharArray();
	/**
	 *	Test condition "I" for isPutMpAch188100()
	 *	@return  Returns true if isPutMpAch188100() is "I"
	 */
   public boolean isPutMpAch188100() throws CFException {
      return (  compareChars( getCheckPutQueue100() , putMpAch18810088Value)  == 0  );
   }


	/**
	*  set values "I"
	*/
   	public void setPutMpAch188100True() {  			
    	setCheckPutQueue100( putMpAch18810088Value);
   	}
	char[] putNmq8810088Value = "J".toCharArray();
	/**
	 *	Test condition "J" for isPutNmq88100()
	 *	@return  Returns true if isPutNmq88100() is "J"
	 */
   public boolean isPutNmq88100() throws CFException {
      return (  compareChars( getCheckPutQueue100() , putNmq8810088Value)  == 0  );
   }


	/**
	*  set values "J"
	*/
   	public void setPutNmq88100True() {  			
    	setCheckPutQueue100( putNmq8810088Value);
   	}
	char[] putQrRefund18810088Value = "K".toCharArray();
	/**
	 *	Test condition "K" for isPutQrRefund188100()
	 *	@return  Returns true if isPutQrRefund188100() is "K"
	 */
   public boolean isPutQrRefund188100() throws CFException {
      return (  compareChars( getCheckPutQueue100() , putQrRefund18810088Value)  == 0  );
   }


	/**
	*  set values "K"
	*/
   	public void setPutQrRefund188100True() {  			
    	setCheckPutQueue100( putQrRefund18810088Value);
   	}
	char[] putInstq8810088Value = "L".toCharArray();
	/**
	 *	Test condition "L" for isPutInstq88100()
	 *	@return  Returns true if isPutInstq88100() is "L"
	 */
   public boolean isPutInstq88100() throws CFException {
      return (  compareChars( getCheckPutQueue100() , putInstq8810088Value)  == 0  );
   }


	/**
	*  set values "L"
	*/
   	public void setPutInstq88100True() {  			
    	setCheckPutQueue100( putInstq8810088Value);
   	}
	char[] putPmtInd8810088Value = "M".toCharArray();
	/**
	 *	Test condition "M" for isPutPmtInd88100()
	 *	@return  Returns true if isPutPmtInd88100() is "M"
	 */
   public boolean isPutPmtInd88100() throws CFException {
      return (  compareChars( getCheckPutQueue100() , putPmtInd8810088Value)  == 0  );
   }


	/**
	*  set values "M"
	*/
   	public void setPutPmtInd88100True() {  			
    	setCheckPutQueue100( putPmtInd8810088Value);
   	}
	char[] putPmaInd8810088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isPutPmaInd88100()
	 *	@return  Returns true if isPutPmaInd88100() is "N"
	 */
   public boolean isPutPmaInd88100() throws CFException {
      return (  compareChars( getCheckPutQueue100() , putPmaInd8810088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setPutPmaInd88100True() {  			
    	setCheckPutQueue100( putPmaInd8810088Value);
   	}
	char[] putPimInd8810088Value = "O".toCharArray();
	/**
	 *	Test condition "O" for isPutPimInd88100()
	 *	@return  Returns true if isPutPimInd88100() is "O"
	 */
   public boolean isPutPimInd88100() throws CFException {
      return (  compareChars( getCheckPutQueue100() , putPimInd8810088Value)  == 0  );
   }


	/**
	*  set values "O"
	*/
   	public void setPutPimInd88100True() {  			
    	setCheckPutQueue100( putPimInd8810088Value);
   	}
	char[] putPmiInd8810088Value = "P".toCharArray();
	/**
	 *	Test condition "P" for isPutPmiInd88100()
	 *	@return  Returns true if isPutPmiInd88100() is "P"
	 */
   public boolean isPutPmiInd88100() throws CFException {
      return (  compareChars( getCheckPutQueue100() , putPmiInd8810088Value)  == 0  );
   }


	/**
	*  set values "P"
	*/
   	public void setPutPmiInd88100True() {  			
    	setCheckPutQueue100( putPmiInd8810088Value);
   	}
	char[] putCaq38810088Value = "Q".toCharArray();
	/**
	 *	Test condition "Q" for isPutCaq388100()
	 *	@return  Returns true if isPutCaq388100() is "Q"
	 */
   public boolean isPutCaq388100() throws CFException {
      return (  compareChars( getCheckPutQueue100() , putCaq38810088Value)  == 0  );
   }


	/**
	*  set values "Q"
	*/
   	public void setPutCaq388100True() {  			
    	setCheckPutQueue100( putCaq38810088Value);
   	}
	char[] putFaaFac38810088Value = "R".toCharArray();
	/**
	 *	Test condition "R" for isPutFaaFac388100()
	 *	@return  Returns true if isPutFaaFac388100() is "R"
	 */
   public boolean isPutFaaFac388100() throws CFException {
      return (  compareChars( getCheckPutQueue100() , putFaaFac38810088Value)  == 0  );
   }


	/**
	*  set values "R"
	*/
   	public void setPutFaaFac388100True() {  			
    	setCheckPutQueue100( putFaaFac38810088Value);
   	}
	char[] putQrRefund38810088Value = "S".toCharArray();
	/**
	 *	Test condition "S" for isPutQrRefund388100()
	 *	@return  Returns true if isPutQrRefund388100() is "S"
	 */
   public boolean isPutQrRefund388100() throws CFException {
      return (  compareChars( getCheckPutQueue100() , putQrRefund38810088Value)  == 0  );
   }


	/**
	*  set values "S"
	*/
   	public void setPutQrRefund388100True() {  			
    	setCheckPutQueue100( putQrRefund38810088Value);
   	}
	char[] putMpAch38810088Value = "T".toCharArray();
	/**
	 *	Test condition "T" for isPutMpAch388100()
	 *	@return  Returns true if isPutMpAch388100() is "T"
	 */
   public boolean isPutMpAch388100() throws CFException {
      return (  compareChars( getCheckPutQueue100() , putMpAch38810088Value)  == 0  );
   }


	/**
	*  set values "T"
	*/
   	public void setPutMpAch388100True() {  			
    	setCheckPutQueue100( putMpAch38810088Value);
   	}
	char[] putAlmpq8810088Value = "U".toCharArray();
	/**
	 *	Test condition "U" for isPutAlmpq88100()
	 *	@return  Returns true if isPutAlmpq88100() is "U"
	 */
   public boolean isPutAlmpq88100() throws CFException {
      return (  compareChars( getCheckPutQueue100() , putAlmpq8810088Value)  == 0  );
   }


	/**
	*  set values "U"
	*/
   	public void setPutAlmpq88100True() {  			
    	setCheckPutQueue100( putAlmpq8810088Value);
   	}
	char[] putAlmcq8810088Value = "V".toCharArray();
	/**
	 *	Test condition "V" for isPutAlmcq88100()
	 *	@return  Returns true if isPutAlmcq88100() is "V"
	 */
   public boolean isPutAlmcq88100() throws CFException {
      return (  compareChars( getCheckPutQueue100() , putAlmcq8810088Value)  == 0  );
   }


	/**
	*  set values "V"
	*/
   	public void setPutAlmcq88100True() {  			
    	setCheckPutQueue100( putAlmcq8810088Value);
   	}
	char[] putFaaFac48810088Value = "W".toCharArray();
	/**
	 *	Test condition "W" for isPutFaaFac488100()
	 *	@return  Returns true if isPutFaaFac488100() is "W"
	 */
   public boolean isPutFaaFac488100() throws CFException {
      return (  compareChars( getCheckPutQueue100() , putFaaFac48810088Value)  == 0  );
   }


	/**
	*  set values "W"
	*/
   	public void setPutFaaFac488100True() {  			
    	setCheckPutQueue100( putFaaFac48810088Value);
   	}
	char[] putPmt8810088Value = "2".toCharArray();
	/**
	 *	Test condition "2" for isPutPmt88100()
	 *	@return  Returns true if isPutPmt88100() is "2"
	 */
   public boolean isPutPmt88100() throws CFException {
      return (  compareChars( getCheckPutQueue100() , putPmt8810088Value)  == 0  );
   }


	/**
	*  set values "2"
	*/
   	public void setPutPmt88100True() {  			
    	setCheckPutQueue100( putPmt8810088Value);
   	}
	char[] putPim8810088Value = "7".toCharArray();
	/**
	 *	Test condition "7" for isPutPim88100()
	 *	@return  Returns true if isPutPim88100() is "7"
	 */
   public boolean isPutPim88100() throws CFException {
      return (  compareChars( getCheckPutQueue100() , putPim8810088Value)  == 0  );
   }


	/**
	*  set values "7"
	*/
   	public void setPutPim88100True() {  			
    	setCheckPutQueue100( putPim8810088Value);
   	}

	
	
	

		public static int getCheckPutQueueGroup100FieldLength() {
			return CHECK_PUT_QUEUE_GROUP_100_LENGTH;
		}

}
  

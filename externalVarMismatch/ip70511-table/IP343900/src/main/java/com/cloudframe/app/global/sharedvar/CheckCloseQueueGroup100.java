package com.cloudframe.app.global.sharedvar;

/**
*  The class CheckCloseQueueGroup100 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_checkCloseQueueGroup100")

public class CheckCloseQueueGroup100 extends CheckCloseQueueGroup100Serialized  implements InitializingBean {
   

						private char[] checkCloseQueue100 = Field.fillLowValue(1);
	
	/**
	* Constructor for CheckCloseQueueGroup100
	**/
    public CheckCloseQueueGroup100() {
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
	 *	Returns the value of checkCloseQueue100
	 *	@return checkCloseQueue100
	 */
   public char[] getCheckCloseQueue100() throws CFException{
     if (isCheckCloseQueue100Modified()) { 
        checkCloseQueue100 = refreshCheckCloseQueue100();
     }
   		return checkCloseQueue100;
   }

  
	/**
	*  set variable checkCloseQueue100
	*  Corresponding COBOL Variable is 100-CHECK-CLOSE-QUEUE
	*  @param value
	**/
   public void setCheckCloseQueue100(char[] value) {
      checkCloseQueue100 = checkCheckCloseQueue100Constraints(value);
      serializeCheckCloseQueue100(checkCloseQueue100);
   } 

     /**
	 * 	Update CheckCloseQueue100 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCheckCloseQueue100(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCheckCloseQueue100,checkCloseQueue100.length);
   	
   }
   
   public void setCheckCloseQueue100(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCheckCloseQueue100,checkCloseQueue100.length);
   	
   }
   
     /**
	 * 	Update CheckCloseQueue100 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCheckCloseQueue100(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCheckCloseQueue100+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CheckCloseQueue100 with another Field
	 *	@param value
	 */
   public void setCheckCloseQueue100(Field source) {
       replace(source,0,source.length(),beginCheckCloseQueue100,CHECK_CLOSE_QUEUE_100_LEN);
   	
   }  
   
     /**
	 * 	Update CheckCloseQueue100 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCheckCloseQueue100(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCheckCloseQueue100,CHECK_CLOSE_QUEUE_100_LEN);
   	
   }
   
     /**
	 * 	Update CheckCloseQueue100 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCheckCloseQueue100(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCheckCloseQueue100+targetIndex,targetLen);
    
   }
	char[] closePmaAms8810088Value = fillZeroes(1);
	/**
	 *	Test condition "0" for isClosePmaAms88100()
	 *	@return  Returns true if isClosePmaAms88100() is "0"
	 */
   public boolean isClosePmaAms88100() throws CFException {
      return (  compareChars( getCheckCloseQueue100() , closePmaAms8810088Value)  == 0  );
   }


	/**
	*  set values "0"
	*/
   	public void setClosePmaAms88100True() {  			
    	setCheckCloseQueue100( closePmaAms8810088Value);
   	}
	char[] closePmiAms8810088Value = "1".toCharArray();
	/**
	 *	Test condition "1" for isClosePmiAms88100()
	 *	@return  Returns true if isClosePmiAms88100() is "1"
	 */
   public boolean isClosePmiAms88100() throws CFException {
      return (  compareChars( getCheckCloseQueue100() , closePmiAms8810088Value)  == 0  );
   }


	/**
	*  set values "1"
	*/
   	public void setClosePmiAms88100True() {  			
    	setCheckCloseQueue100( closePmiAms8810088Value);
   	}
	char[] closePimAms8810088Value = "2".toCharArray();
	/**
	 *	Test condition "2" for isClosePimAms88100()
	 *	@return  Returns true if isClosePimAms88100() is "2"
	 */
   public boolean isClosePimAms88100() throws CFException {
      return (  compareChars( getCheckCloseQueue100() , closePimAms8810088Value)  == 0  );
   }


	/**
	*  set values "2"
	*/
   	public void setClosePimAms88100True() {  			
    	setCheckCloseQueue100( closePimAms8810088Value);
   	}
	char[] closePma8810088Value = "3".toCharArray();
	/**
	 *	Test condition "3" for isClosePma88100()
	 *	@return  Returns true if isClosePma88100() is "3"
	 */
   public boolean isClosePma88100() throws CFException {
      return (  compareChars( getCheckCloseQueue100() , closePma8810088Value)  == 0  );
   }


	/**
	*  set values "3"
	*/
   	public void setClosePma88100True() {  			
    	setCheckCloseQueue100( closePma8810088Value);
   	}
	char[] closePmi8810088Value = "4".toCharArray();
	/**
	 *	Test condition "4" for isClosePmi88100()
	 *	@return  Returns true if isClosePmi88100() is "4"
	 */
   public boolean isClosePmi88100() throws CFException {
      return (  compareChars( getCheckCloseQueue100() , closePmi8810088Value)  == 0  );
   }


	/**
	*  set values "4"
	*/
   	public void setClosePmi88100True() {  			
    	setCheckCloseQueue100( closePmi8810088Value);
   	}
	char[] closePim8810088Value = "5".toCharArray();
	/**
	 *	Test condition "5" for isClosePim88100()
	 *	@return  Returns true if isClosePim88100() is "5"
	 */
   public boolean isClosePim88100() throws CFException {
      return (  compareChars( getCheckCloseQueue100() , closePim8810088Value)  == 0  );
   }


	/**
	*  set values "5"
	*/
   	public void setClosePim88100True() {  			
    	setCheckCloseQueue100( closePim8810088Value);
   	}
	char[] closePmt8810088Value = "6".toCharArray();
	/**
	 *	Test condition "6" for isClosePmt88100()
	 *	@return  Returns true if isClosePmt88100() is "6"
	 */
   public boolean isClosePmt88100() throws CFException {
      return (  compareChars( getCheckCloseQueue100() , closePmt8810088Value)  == 0  );
   }


	/**
	*  set values "6"
	*/
   	public void setClosePmt88100True() {  			
    	setCheckCloseQueue100( closePmt8810088Value);
   	}
	char[] closeCaq8810088Value = "7".toCharArray();
	/**
	 *	Test condition "7" for isCloseCaq88100()
	 *	@return  Returns true if isCloseCaq88100() is "7"
	 */
   public boolean isCloseCaq88100() throws CFException {
      return (  compareChars( getCheckCloseQueue100() , closeCaq8810088Value)  == 0  );
   }


	/**
	*  set values "7"
	*/
   	public void setCloseCaq88100True() {  			
    	setCheckCloseQueue100( closeCaq8810088Value);
   	}
	char[] closeCemreqMq8810088Value = "8".toCharArray();
	/**
	 *	Test condition "8" for isCloseCemreqMq88100()
	 *	@return  Returns true if isCloseCemreqMq88100() is "8"
	 */
   public boolean isCloseCemreqMq88100() throws CFException {
      return (  compareChars( getCheckCloseQueue100() , closeCemreqMq8810088Value)  == 0  );
   }


	/**
	*  set values "8"
	*/
   	public void setCloseCemreqMq88100True() {  			
    	setCheckCloseQueue100( closeCemreqMq8810088Value);
   	}
	char[] closeCemresMq18810088Value = "9".toCharArray();
	/**
	 *	Test condition "9" for isCloseCemresMq188100()
	 *	@return  Returns true if isCloseCemresMq188100() is "9"
	 */
   public boolean isCloseCemresMq188100() throws CFException {
      return (  compareChars( getCheckCloseQueue100() , closeCemresMq18810088Value)  == 0  );
   }


	/**
	*  set values "9"
	*/
   	public void setCloseCemresMq188100True() {  			
    	setCheckCloseQueue100( closeCemresMq18810088Value);
   	}
	char[] closeFaaFac8810088Value = "A".toCharArray();
	/**
	 *	Test condition "A" for isCloseFaaFac88100()
	 *	@return  Returns true if isCloseFaaFac88100() is "A"
	 */
   public boolean isCloseFaaFac88100() throws CFException {
      return (  compareChars( getCheckCloseQueue100() , closeFaaFac8810088Value)  == 0  );
   }


	/**
	*  set values "A"
	*/
   	public void setCloseFaaFac88100True() {  			
    	setCheckCloseQueue100( closeFaaFac8810088Value);
   	}
	char[] closeCemresMq28810088Value = "B".toCharArray();
	/**
	 *	Test condition "B" for isCloseCemresMq288100()
	 *	@return  Returns true if isCloseCemresMq288100() is "B"
	 */
   public boolean isCloseCemresMq288100() throws CFException {
      return (  compareChars( getCheckCloseQueue100() , closeCemresMq28810088Value)  == 0  );
   }


	/**
	*  set values "B"
	*/
   	public void setCloseCemresMq288100True() {  			
    	setCheckCloseQueue100( closeCemresMq28810088Value);
   	}
	char[] closeCemresMq38810088Value = "C".toCharArray();
	/**
	 *	Test condition "C" for isCloseCemresMq388100()
	 *	@return  Returns true if isCloseCemresMq388100() is "C"
	 */
   public boolean isCloseCemresMq388100() throws CFException {
      return (  compareChars( getCheckCloseQueue100() , closeCemresMq38810088Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setCloseCemresMq388100True() {  			
    	setCheckCloseQueue100( closeCemresMq38810088Value);
   	}
	char[] closeFpq8810088Value = "D".toCharArray();
	/**
	 *	Test condition "D" for isCloseFpq88100()
	 *	@return  Returns true if isCloseFpq88100() is "D"
	 */
   public boolean isCloseFpq88100() throws CFException {
      return (  compareChars( getCheckCloseQueue100() , closeFpq8810088Value)  == 0  );
   }


	/**
	*  set values "D"
	*/
   	public void setCloseFpq88100True() {  			
    	setCheckCloseQueue100( closeFpq8810088Value);
   	}
	char[] closeMpAch8810088Value = "E".toCharArray();
	/**
	 *	Test condition "E" for isCloseMpAch88100()
	 *	@return  Returns true if isCloseMpAch88100() is "E"
	 */
   public boolean isCloseMpAch88100() throws CFException {
      return (  compareChars( getCheckCloseQueue100() , closeMpAch8810088Value)  == 0  );
   }


	/**
	*  set values "E"
	*/
   	public void setCloseMpAch88100True() {  			
    	setCheckCloseQueue100( closeMpAch8810088Value);
   	}
	char[] closeNmq8810088Value = "F".toCharArray();
	/**
	 *	Test condition "F" for isCloseNmq88100()
	 *	@return  Returns true if isCloseNmq88100() is "F"
	 */
   public boolean isCloseNmq88100() throws CFException {
      return (  compareChars( getCheckCloseQueue100() , closeNmq8810088Value)  == 0  );
   }


	/**
	*  set values "F"
	*/
   	public void setCloseNmq88100True() {  			
    	setCheckCloseQueue100( closeNmq8810088Value);
   	}
	char[] closeQrRefunds8810088Value = "G".toCharArray();
	/**
	 *	Test condition "G" for isCloseQrRefunds88100()
	 *	@return  Returns true if isCloseQrRefunds88100() is "G"
	 */
   public boolean isCloseQrRefunds88100() throws CFException {
      return (  compareChars( getCheckCloseQueue100() , closeQrRefunds8810088Value)  == 0  );
   }


	/**
	*  set values "G"
	*/
   	public void setCloseQrRefunds88100True() {  			
    	setCheckCloseQueue100( closeQrRefunds8810088Value);
   	}
	char[] closeInstq8810088Value = "H".toCharArray();
	/**
	 *	Test condition "H" for isCloseInstq88100()
	 *	@return  Returns true if isCloseInstq88100() is "H"
	 */
   public boolean isCloseInstq88100() throws CFException {
      return (  compareChars( getCheckCloseQueue100() , closeInstq8810088Value)  == 0  );
   }


	/**
	*  set values "H"
	*/
   	public void setCloseInstq88100True() {  			
    	setCheckCloseQueue100( closeInstq8810088Value);
   	}
	char[] closeAlmqPre8810088Value = "I".toCharArray();
	/**
	 *	Test condition "I" for isCloseAlmqPre88100()
	 *	@return  Returns true if isCloseAlmqPre88100() is "I"
	 */
   public boolean isCloseAlmqPre88100() throws CFException {
      return (  compareChars( getCheckCloseQueue100() , closeAlmqPre8810088Value)  == 0  );
   }


	/**
	*  set values "I"
	*/
   	public void setCloseAlmqPre88100True() {  			
    	setCheckCloseQueue100( closeAlmqPre8810088Value);
   	}
	char[] closeAlmqCha8810088Value = "J".toCharArray();
	/**
	 *	Test condition "J" for isCloseAlmqCha88100()
	 *	@return  Returns true if isCloseAlmqCha88100() is "J"
	 */
   public boolean isCloseAlmqCha88100() throws CFException {
      return (  compareChars( getCheckCloseQueue100() , closeAlmqCha8810088Value)  == 0  );
   }


	/**
	*  set values "J"
	*/
   	public void setCloseAlmqCha88100True() {  			
    	setCheckCloseQueue100( closeAlmqCha8810088Value);
   	}
	char[] closeAlmqRsp8810088Value = "K".toCharArray();
	/**
	 *	Test condition "K" for isCloseAlmqRsp88100()
	 *	@return  Returns true if isCloseAlmqRsp88100() is "K"
	 */
   public boolean isCloseAlmqRsp88100() throws CFException {
      return (  compareChars( getCheckCloseQueue100() , closeAlmqRsp8810088Value)  == 0  );
   }


	/**
	*  set values "K"
	*/
   	public void setCloseAlmqRsp88100True() {  			
    	setCheckCloseQueue100( closeAlmqRsp8810088Value);
   	}

	
	
	

		public static int getCheckCloseQueueGroup100FieldLength() {
			return CHECK_CLOSE_QUEUE_GROUP_100_LENGTH;
		}

}
  

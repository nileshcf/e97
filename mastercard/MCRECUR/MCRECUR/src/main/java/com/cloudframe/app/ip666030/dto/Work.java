package com.cloudframe.app.ip666030.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:03. using version 5.0.0.256
**/


import com.cloudframe.app.ip666030.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized {
   

						private char[] isItTheFirstTime100 = new char[1];

						private char[] pgmIp666030300 = new char[8];

								private int start400;

								private int median400;

								private int end400;

						private char[] ptrIp666030800 = new char[8];

						private char[] tagTemp800 = Field.fillLowValue(13);

								private int startCf800;

								private int endCf800;

								private int leftCf800;

								private int rightCf800;

								private int medianCf800;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setIsItTheFirstTime100(("Y").toCharArray());
								setPgmIp666030300(("IP666030").toCharArray());
								setPtrIp666030800(("IP666030").toCharArray());
    }


 

	/**
	 *	Returns the value of isItTheFirstTime100
	 *	@return isItTheFirstTime100
	 */
   public char[] getIsItTheFirstTime100() throws CFException{
   		return isItTheFirstTime100;
   }

  
	/**
	*  set variable isItTheFirstTime100
	*  Corresponding COBOL Variable is 100-IS-IT-THE-FIRST-TIME
	*  @param value
	**/
   public void setIsItTheFirstTime100(char[] value) {
       value = checkIsItTheFirstTime100Constraints(value);
       arraycopy(value,0,isItTheFirstTime100,0,value.length);
   } 
	public void setIsItTheFirstTime100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,isItTheFirstTime100,0,beginIndex + endIndex);
   }
	char[] itIsTheFirstTime10088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isItIsTheFirstTime100()
	 *	@return  Returns true if isItIsTheFirstTime100() is "Y"
	 */
   public boolean isItIsTheFirstTime100() throws CFException {
      return (  compareChars( getIsItTheFirstTime100() , itIsTheFirstTime10088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setItIsTheFirstTime100True() {  			
    	setIsItTheFirstTime100( itIsTheFirstTime10088Value);
   	}
	/**
	 *	Returns the value of pgmIp666030300
	 *	@return pgmIp666030300
	 */
   public char[] getPgmIp666030300() throws CFException{
   		return pgmIp666030300;
   }

  
	/**
	*  set variable pgmIp666030300
	*  Corresponding COBOL Variable is 300-PGM-IP666030
	*  @param value
	**/
   public void setPgmIp666030300(char[] value) {
       value = checkPgmIp666030300Constraints(value);
       arraycopy(value,0,pgmIp666030300,0,value.length);
   } 
	public void setPgmIp666030300(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,pgmIp666030300,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of start400
	 *	@return start400
	 */
	public int getStart400() throws CFException {
   		return start400;
	}
	
	/**
	 * 	Update Start400 with the passed value
	 *  Corresponding COBOL Variable is 400-START
	 *	@param number
	 */
	public void setStart400(int number) {
	     // Truncate if the number is beyond +/- Max range
	    start400 = checkStart400MaxLimit(number); 
	}


	public void setStart400(long number) {
	    number = checkStart400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setStart400((int)number);
	}
	
	/**
	 *	Returns the value of median400
	 *	@return median400
	 */
	public int getMedian400() throws CFException {
   		return median400;
	}
	
	/**
	 * 	Update Median400 with the passed value
	 *  Corresponding COBOL Variable is 400-MEDIAN
	 *	@param number
	 */
	public void setMedian400(int number) {
	     // Truncate if the number is beyond +/- Max range
	    median400 = checkMedian400MaxLimit(number); 
	}


	public void setMedian400(long number) {
	    number = checkMedian400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setMedian400((int)number);
	}
	
	/**
	 *	Returns the value of end400
	 *	@return end400
	 */
	public int getEnd400() throws CFException {
   		return end400;
	}
	
	/**
	 * 	Update End400 with the passed value
	 *  Corresponding COBOL Variable is 400-END
	 *	@param number
	 */
	public void setEnd400(int number) {
	     // Truncate if the number is beyond +/- Max range
	    end400 = checkEnd400MaxLimit(number); 
	}


	public void setEnd400(long number) {
	    number = checkEnd400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setEnd400((int)number);
	}
	
	/**
	 *	Returns the value of ptrIp666030800
	 *	@return ptrIp666030800
	 */
   public char[] getPtrIp666030800() throws CFException{
   		return ptrIp666030800;
   }

  
	/**
	*  set variable ptrIp666030800
	*  Corresponding COBOL Variable is 800-PTR-IP666030
	*  @param value
	**/
   public void setPtrIp666030800(char[] value) {
       value = checkPtrIp666030800Constraints(value);
       arraycopy(value,0,ptrIp666030800,0,value.length);
   } 
	public void setPtrIp666030800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,ptrIp666030800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of tagTemp800
	 *	@return tagTemp800
	 */
   public char[] getTagTemp800() throws CFException{
   		return tagTemp800;
   }

  
	/**
	*  set variable tagTemp800
	*  Corresponding COBOL Variable is 800-TAG-TEMP
	*  @param value
	**/
   public void setTagTemp800(char[] value) {
       value = checkTagTemp800Constraints(value);
       arraycopy(value,0,tagTemp800,0,value.length);
   } 
	public void setTagTemp800(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,tagTemp800,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of startCf800
	 *	@return startCf800
	 */
	public int getStartCf800() throws CFException {
       if (isStartCf800Modified()) { 
           startCf800 = refreshStartCf800();
        }
   		return startCf800;
	}
	

	
	   
	/**
	 * 	Update StartCf800 with the passed value
	 *  Corresponding COBOL Variable is 800-START-CF
	 *	@param number
	 */
	public void setStartCf800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    startCf800 = checkStartCf800MaxLimit(number); 
		serializeStartCf800(startCf800);
	}
	

	public void setStartCf800(long number) {
	    number = checkStartCf800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setStartCf800((int)number);
	}
	
	/**
	 * 	Update StartCf800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setStartCf800(char[] value) throws CFException {
		 startCf800 = serializeStartCf800(value);
	}
	/**
	 * 	Update StartCf800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setStartCf800String(char[] value) throws CFException {
		 setStartCf800(value);
	}
	/**
	 *	Returns the value of endCf800
	 *	@return endCf800
	 */
	public int getEndCf800() throws CFException {
       if (isEndCf800Modified()) { 
           endCf800 = refreshEndCf800();
        }
   		return endCf800;
	}
	

	
	   
	/**
	 * 	Update EndCf800 with the passed value
	 *  Corresponding COBOL Variable is 800-END-CF
	 *	@param number
	 */
	public void setEndCf800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    endCf800 = checkEndCf800MaxLimit(number); 
		serializeEndCf800(endCf800);
	}
	

	public void setEndCf800(long number) {
	    number = checkEndCf800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setEndCf800((int)number);
	}
	
	/**
	 * 	Update EndCf800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setEndCf800(char[] value) throws CFException {
		 endCf800 = serializeEndCf800(value);
	}
	/**
	 * 	Update EndCf800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setEndCf800String(char[] value) throws CFException {
		 setEndCf800(value);
	}
	/**
	 *	Returns the value of leftCf800
	 *	@return leftCf800
	 */
	public int getLeftCf800() throws CFException {
       if (isLeftCf800Modified()) { 
           leftCf800 = refreshLeftCf800();
        }
   		return leftCf800;
	}
	

	
	   
	/**
	 * 	Update LeftCf800 with the passed value
	 *  Corresponding COBOL Variable is 800-LEFT-CF
	 *	@param number
	 */
	public void setLeftCf800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    leftCf800 = checkLeftCf800MaxLimit(number); 
		serializeLeftCf800(leftCf800);
	}
	

	public void setLeftCf800(long number) {
	    number = checkLeftCf800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setLeftCf800((int)number);
	}
	
	/**
	 * 	Update LeftCf800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setLeftCf800(char[] value) throws CFException {
		 leftCf800 = serializeLeftCf800(value);
	}
	/**
	 * 	Update LeftCf800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLeftCf800String(char[] value) throws CFException {
		 setLeftCf800(value);
	}
	/**
	 *	Returns the value of rightCf800
	 *	@return rightCf800
	 */
	public int getRightCf800() throws CFException {
       if (isRightCf800Modified()) { 
           rightCf800 = refreshRightCf800();
        }
   		return rightCf800;
	}
	

	
	   
	/**
	 * 	Update RightCf800 with the passed value
	 *  Corresponding COBOL Variable is 800-RIGHT-CF
	 *	@param number
	 */
	public void setRightCf800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    rightCf800 = checkRightCf800MaxLimit(number); 
		serializeRightCf800(rightCf800);
	}
	

	public void setRightCf800(long number) {
	    number = checkRightCf800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setRightCf800((int)number);
	}
	
	/**
	 * 	Update RightCf800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setRightCf800(char[] value) throws CFException {
		 rightCf800 = serializeRightCf800(value);
	}
	/**
	 * 	Update RightCf800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRightCf800String(char[] value) throws CFException {
		 setRightCf800(value);
	}
	/**
	 *	Returns the value of medianCf800
	 *	@return medianCf800
	 */
	public int getMedianCf800() throws CFException {
       if (isMedianCf800Modified()) { 
           medianCf800 = refreshMedianCf800();
        }
   		return medianCf800;
	}
	

	
	   
	/**
	 * 	Update MedianCf800 with the passed value
	 *  Corresponding COBOL Variable is 800-MEDIAN-CF
	 *	@param number
	 */
	public void setMedianCf800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    medianCf800 = checkMedianCf800MaxLimit(number); 
		serializeMedianCf800(medianCf800);
	}
	

	public void setMedianCf800(long number) {
	    number = checkMedianCf800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setMedianCf800((int)number);
	}
	
	/**
	 * 	Update MedianCf800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMedianCf800(char[] value) throws CFException {
		 medianCf800 = serializeMedianCf800(value);
	}
	/**
	 * 	Update MedianCf800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMedianCf800String(char[] value) throws CFException {
		 setMedianCf800(value);
	}

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  

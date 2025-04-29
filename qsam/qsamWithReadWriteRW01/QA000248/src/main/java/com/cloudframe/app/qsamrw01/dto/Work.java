package com.cloudframe.app.qsamrw01.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:43. using version 5.0.0.254
**/


import com.cloudframe.app.qsamrw01.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized {
   

						private char[] isItTheFirstTime100 = new char[1];

						private char[] histFileEmptySw100 = new char[1];

								private int fileSeqNbr400;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setIsItTheFirstTime100(("Y").toCharArray());
								setHistFileEmptySw100(("N").toCharArray());
								setFileSeqNbr400(0);
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
	char[] itIsTheFirstTime8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isItIsTheFirstTime88()
	 *	@return  Returns true if isItIsTheFirstTime88() is "Y"
	 */
   public boolean isItIsTheFirstTime88() throws CFException {
      return (  compareChars( getIsItTheFirstTime100() , itIsTheFirstTime8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setItIsTheFirstTime88True() {  			
    	setIsItTheFirstTime100( itIsTheFirstTime8888Value);
   	}
	char[] itIsNotFirstTime8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isItIsNotFirstTime88()
	 *	@return  Returns true if isItIsNotFirstTime88() is "N"
	 */
   public boolean isItIsNotFirstTime88() throws CFException {
      return (  compareChars( getIsItTheFirstTime100() , itIsNotFirstTime8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setItIsNotFirstTime88True() {  			
    	setIsItTheFirstTime100( itIsNotFirstTime8888Value);
   	}
	/**
	 *	Returns the value of histFileEmptySw100
	 *	@return histFileEmptySw100
	 */
   public char[] getHistFileEmptySw100() throws CFException{
   		return histFileEmptySw100;
   }

  
	/**
	*  set variable histFileEmptySw100
	*  Corresponding COBOL Variable is 100-HIST-FILE-EMPTY-SW
	*  @param value
	**/
   public void setHistFileEmptySw100(char[] value) {
       value = checkHistFileEmptySw100Constraints(value);
       arraycopy(value,0,histFileEmptySw100,0,value.length);
   } 
	public void setHistFileEmptySw100(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,histFileEmptySw100,0,beginIndex + endIndex);
   }
	char[] histFileEmpty8810088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isHistFileEmpty88100()
	 *	@return  Returns true if isHistFileEmpty88100() is "Y"
	 */
   public boolean isHistFileEmpty88100() throws CFException {
      return (  compareChars( getHistFileEmptySw100() , histFileEmpty8810088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setHistFileEmpty88100True() {  			
    	setHistFileEmptySw100( histFileEmpty8810088Value);
   	}
	/**
	 *	Returns the value of fileSeqNbr400
	 *	@return fileSeqNbr400
	 */
	public int getFileSeqNbr400() throws CFException {
       if (isFileSeqNbr400Modified()) { 
           fileSeqNbr400 = refreshFileSeqNbr400();
        }
   		return fileSeqNbr400;
	}
	

	
	   
	/**
	 * 	Update FileSeqNbr400 with the passed value
	 *  Corresponding COBOL Variable is 400-FILE-SEQ-NBR
	 *	@param number
	 */
	public void setFileSeqNbr400(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    fileSeqNbr400 = checkFileSeqNbr400MaxLimit(number); 
		serializeFileSeqNbr400(fileSeqNbr400);
	}
	

	public void setFileSeqNbr400(long number) {
	    number = checkFileSeqNbr400MaxLimit(number); // Truncate if value is beyond +/- Max range
		setFileSeqNbr400((int)number);
	}
	
	/**
	 * 	Update FileSeqNbr400 with the passed value
	 *	@param value (String or char[])
	 */
	public void setFileSeqNbr400(char[] value) throws CFException {
		 fileSeqNbr400 = serializeFileSeqNbr400(value);
	}
	/**
	 * 	Update FileSeqNbr400 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFileSeqNbr400String(char[] value) throws CFException {
		 setFileSeqNbr400(value);
	}

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  

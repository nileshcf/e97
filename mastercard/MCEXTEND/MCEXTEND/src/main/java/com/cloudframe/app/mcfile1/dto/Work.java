package com.cloudframe.app.mcfile1.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/


import com.cloudframe.app.mcfile1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Work extends WorkSerialized { 
   

						private char[] outpStatus = Field.fillLowValue(2);

						private char[] firsttimeFlag = new char[1];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setFirsttimeFlag(("Y").toCharArray());
    }


 

	/**
	 *	Returns the value of outpStatus
	 *	@return outpStatus
	 */
   public char[] getOutpStatus() throws CFException{
   		return outpStatus;
   }

  
	/**
	*  set variable outpStatus
	*  Corresponding COBOL Variable is WS-OUTP-STATUS
	*  @param value
	**/
   public void setOutpStatus(char[] value) {
       value = checkOutpStatusConstraints(value);
       arraycopy(value,0,outpStatus,0,value.length);
   } 
	public void setOutpStatus(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,outpStatus,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of firsttimeFlag
	 *	@return firsttimeFlag
	 */
   public char[] getFirsttimeFlag() throws CFException{
   		return firsttimeFlag;
   }

  
	/**
	*  set variable firsttimeFlag
	*  Corresponding COBOL Variable is FIRSTTIME-FLAG
	*  @param value
	**/
   public void setFirsttimeFlag(char[] value) {
       value = checkFirsttimeFlagConstraints(value);
       arraycopy(value,0,firsttimeFlag,0,value.length);
   } 
	public void setFirsttimeFlag(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,firsttimeFlag,0,beginIndex + endIndex);
   }
	char[] firsttime88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isFirsttime()
	 *	@return  Returns true if isFirsttime() is "Y"
	 */
   public boolean isFirsttime() throws CFException {
      return (  compareChars( getFirsttimeFlag() , firsttime88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setFirsttimeTrue() {  			
    	setFirsttimeFlag( firsttime88Value);
   	}

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  

package com.cloudframe.app.cpsc4.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:20. using version 5.0.0.254
**/


import com.cloudframe.app.cpsc4.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized {
   

						private char[] s0v3DtlRec = new char[2000];

						private char[] driftFlag = new char[1];

								private int driftDataCnt;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setS0v3DtlRec(pad(2000," ".toCharArray(),' ',RIGHT_PAD));
								setDriftFlag(("N").toCharArray());
								setDriftDataCnt(0);
    }


 

	/**
	 *	Returns the value of s0v3DtlRec
	 *	@return s0v3DtlRec
	 */
   public char[] getS0v3DtlRec() throws CFException{
   		return s0v3DtlRec;
   }

  
	/**
	*  set variable s0v3DtlRec
	*  Corresponding COBOL Variable is WS-S0V3-DTL-REC
	*  @param value
	**/
   public void setS0v3DtlRec(char[] value) {
       value = checkS0v3DtlRecConstraints(value);
       arraycopy(value,0,s0v3DtlRec,0,value.length);
   } 
	public void setS0v3DtlRec(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,s0v3DtlRec,0,beginIndex + endIndex);
   }
	/**
	 *	Returns the value of driftFlag
	 *	@return driftFlag
	 */
   public char[] getDriftFlag() throws CFException{
   		return driftFlag;
   }

  
	/**
	*  set variable driftFlag
	*  Corresponding COBOL Variable is WS-DRIFT-FLAG
	*  @param value
	**/
   public void setDriftFlag(char[] value) {
       value = checkDriftFlagConstraints(value);
       arraycopy(value,0,driftFlag,0,value.length);
   } 
	public void setDriftFlag(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,driftFlag,0,beginIndex + endIndex);
   }
	char[] driftFound88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isDriftFound()
	 *	@return  Returns true if isDriftFound() is "Y"
	 */
   public boolean isDriftFound() throws CFException {
      return (  compareChars( getDriftFlag() , driftFound88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setDriftFoundTrue() {  			
    	setDriftFlag( driftFound88Value);
   	}
	char[] driftNotFound88Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isDriftNotFound()
	 *	@return  Returns true if isDriftNotFound() is "N"
	 */
   public boolean isDriftNotFound() throws CFException {
      return (  compareChars( getDriftFlag() , driftNotFound88Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setDriftNotFoundTrue() {  			
    	setDriftFlag( driftNotFound88Value);
   	}
	/**
	 *	Returns the value of driftDataCnt
	 *	@return driftDataCnt
	 */
	public int getDriftDataCnt() throws CFException {
       if (isDriftDataCntModified()) { 
           driftDataCnt = refreshDriftDataCnt();
        }
   		return driftDataCnt;
	}
	

	
	   
	/**
	 * 	Update DriftDataCnt with the passed value
	 *  Corresponding COBOL Variable is WS-DRIFT-DATA-CNT
	 *	@param number
	 */
	public void setDriftDataCnt(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    driftDataCnt = checkDriftDataCntMaxLimit(number); 
		serializeDriftDataCnt(driftDataCnt);
	}
	

	public void setDriftDataCnt(long number) {
	    number = checkDriftDataCntMaxLimit(number); // Truncate if value is beyond +/- Max range
		setDriftDataCnt((int)number);
	}
	
	/**
	 * 	Update DriftDataCnt with the passed value
	 *	@param value (String or char[])
	 */
	public void setDriftDataCnt(char[] value) throws CFException {
		 driftDataCnt = serializeDriftDataCnt(value);
	}
	/**
	 * 	Update DriftDataCnt with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDriftDataCntString(char[] value) throws CFException {
		 setDriftDataCnt(value);
	}

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  

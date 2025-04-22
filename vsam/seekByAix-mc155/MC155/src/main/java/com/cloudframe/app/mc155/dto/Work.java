package com.cloudframe.app.mc155.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:09. using version 5.0.0.254
**/


import com.cloudframe.app.mc155.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized {
   

						private char[] uniqueFileIdFileStatus200 = new char[2];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setUniqueFileIdFileStatus200(fillSpace(2));
    }


 

	/**
	 *	Returns the value of uniqueFileIdFileStatus200
	 *	@return uniqueFileIdFileStatus200
	 */
   public char[] getUniqueFileIdFileStatus200() throws CFException{
   		return uniqueFileIdFileStatus200;
   }

  
	/**
	*  set variable uniqueFileIdFileStatus200
	*  Corresponding COBOL Variable is 200-UNIQUE-FILE-ID-FILE-STATUS
	*  @param value
	**/
   public void setUniqueFileIdFileStatus200(char[] value) {
       value = checkUniqueFileIdFileStatus200Constraints(value);
       arraycopy(value,0,uniqueFileIdFileStatus200,0,value.length);
   } 
	public void setUniqueFileIdFileStatus200(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,uniqueFileIdFileStatus200,0,beginIndex + endIndex);
   }
	char[] sys109StatusGood8820088Value = "00".toCharArray();
	/**
	 *	Test condition "00" for isSys109StatusGood88200()
	 *	@return  Returns true if isSys109StatusGood88200() is "00"
	 */
   public boolean isSys109StatusGood88200() throws CFException {
      return (  compareChars( getUniqueFileIdFileStatus200() , sys109StatusGood8820088Value)  == 0  );
   }


	/**
	*  set values "00"
	*/
   	public void setSys109StatusGood88200True() {  			
    	setUniqueFileIdFileStatus200( sys109StatusGood8820088Value);
   	}
	char[] sys109GoodDup8820088Value = "02".toCharArray();
	/**
	 *	Test condition "02" for isSys109GoodDup88200()
	 *	@return  Returns true if isSys109GoodDup88200() is "02"
	 */
   public boolean isSys109GoodDup88200() throws CFException {
      return (  compareChars( getUniqueFileIdFileStatus200() , sys109GoodDup8820088Value)  == 0  );
   }


	/**
	*  set values "02"
	*/
   	public void setSys109GoodDup88200True() {  			
    	setUniqueFileIdFileStatus200( sys109GoodDup8820088Value);
   	}
	char[] sys109EndOfFile8820088Value = "10".toCharArray();
	/**
	 *	Test condition "10" for isSys109EndOfFile88200()
	 *	@return  Returns true if isSys109EndOfFile88200() is "10"
	 */
   public boolean isSys109EndOfFile88200() throws CFException {
      return (  compareChars( getUniqueFileIdFileStatus200() , sys109EndOfFile8820088Value)  == 0  );
   }


	/**
	*  set values "10"
	*/
   	public void setSys109EndOfFile88200True() {  			
    	setUniqueFileIdFileStatus200( sys109EndOfFile8820088Value);
   	}
	char[] sys109Duplicate8820088Value = "22".toCharArray();
	/**
	 *	Test condition "22" for isSys109Duplicate88200()
	 *	@return  Returns true if isSys109Duplicate88200() is "22"
	 */
   public boolean isSys109Duplicate88200() throws CFException {
      return (  compareChars( getUniqueFileIdFileStatus200() , sys109Duplicate8820088Value)  == 0  );
   }


	/**
	*  set values "22"
	*/
   	public void setSys109Duplicate88200True() {  			
    	setUniqueFileIdFileStatus200( sys109Duplicate8820088Value);
   	}
	char[] sys109NoRecord8820088Value = "23".toCharArray();
	/**
	 *	Test condition "23" for isSys109NoRecord88200()
	 *	@return  Returns true if isSys109NoRecord88200() is "23"
	 */
   public boolean isSys109NoRecord88200() throws CFException {
      return (  compareChars( getUniqueFileIdFileStatus200() , sys109NoRecord8820088Value)  == 0  );
   }


	/**
	*  set values "23"
	*/
   	public void setSys109NoRecord88200True() {  			
    	setUniqueFileIdFileStatus200( sys109NoRecord8820088Value);
   	}
	char[] sys109Status978820088Value = "97".toCharArray();
	/**
	 *	Test condition "97" for isSys109Status9788200()
	 *	@return  Returns true if isSys109Status9788200() is "97"
	 */
   public boolean isSys109Status9788200() throws CFException {
      return (  compareChars( getUniqueFileIdFileStatus200() , sys109Status978820088Value)  == 0  );
   }


	/**
	*  set values "97"
	*/
   	public void setSys109Status9788200True() {  			
    	setUniqueFileIdFileStatus200( sys109Status978820088Value);
   	}
	char[] sys109FileNotFound8820088Value = "35".toCharArray();
	/**
	 *	Test condition "35" for isSys109FileNotFound88200()
	 *	@return  Returns true if isSys109FileNotFound88200() is "35"
	 */
   public boolean isSys109FileNotFound88200() throws CFException {
      return (  compareChars( getUniqueFileIdFileStatus200() , sys109FileNotFound8820088Value)  == 0  );
   }


	/**
	*  set values "35"
	*/
   	public void setSys109FileNotFound88200True() {  			
    	setUniqueFileIdFileStatus200( sys109FileNotFound8820088Value);
   	}

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  

package com.cloudframe.app.cfsort03.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/


import com.cloudframe.app.cfsort03.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class Work extends WorkSerialized {
   

								private int cfoutStat;

								private int cfinStat;

								private short noMoreRecordsSw;

						private char[] eofSw = new char[1];
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setCfoutStat(0);
								setCfinStat(0);
								setNoMoreRecordsSw((short)0);
								setEofSw(fillSpace(1));
    }


 

	/**
	 *	Returns the value of cfoutStat
	 *	@return cfoutStat
	 */
	public int getCfoutStat() throws CFException {
       if (isCfoutStatModified()) { 
           cfoutStat = refreshCfoutStat();
        }
   		return cfoutStat;
	}
	

	
	   
	/**
	 * 	Update CfoutStat with the passed value
	 *  Corresponding COBOL Variable is CFOUT-STAT
	 *	@param number
	 */
	public void setCfoutStat(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cfoutStat = checkCfoutStatMaxLimit(number); 
		serializeCfoutStat(cfoutStat);
	}
	

	public void setCfoutStat(long number) {
	    number = checkCfoutStatMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCfoutStat((int)number);
	}
	
	/**
	 * 	Update CfoutStat with the passed value
	 *	@param value (String or char[])
	 */
	public void setCfoutStat(char[] value) throws CFException {
		 cfoutStat = serializeCfoutStat(value);
	}
	/**
	 * 	Update CfoutStat with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCfoutStatString(char[] value) throws CFException {
		 setCfoutStat(value);
	}
	/**
	 *	Returns the value of cfinStat
	 *	@return cfinStat
	 */
	public int getCfinStat() throws CFException {
       if (isCfinStatModified()) { 
           cfinStat = refreshCfinStat();
        }
   		return cfinStat;
	}
	

	
	   
	/**
	 * 	Update CfinStat with the passed value
	 *  Corresponding COBOL Variable is CFIN-STAT
	 *	@param number
	 */
	public void setCfinStat(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    cfinStat = checkCfinStatMaxLimit(number); 
		serializeCfinStat(cfinStat);
	}
	

	public void setCfinStat(long number) {
	    number = checkCfinStatMaxLimit(number); // Truncate if value is beyond +/- Max range
		setCfinStat((int)number);
	}
	
	/**
	 * 	Update CfinStat with the passed value
	 *	@param value (String or char[])
	 */
	public void setCfinStat(char[] value) throws CFException {
		 cfinStat = serializeCfinStat(value);
	}
	/**
	 * 	Update CfinStat with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCfinStatString(char[] value) throws CFException {
		 setCfinStat(value);
	}
	/**
	 *	Returns the value of noMoreRecordsSw
	 *	@return noMoreRecordsSw
	 */
	public short getNoMoreRecordsSw() throws CFException {
   		return noMoreRecordsSw;
	}
	
	/**
	 * 	Update NoMoreRecordsSw with the passed value
	 *  Corresponding COBOL Variable is WS-NO-MORE-RECORDS-SW
	 *	@param number
	 */
	public void setNoMoreRecordsSw(short number) {
	     // Truncate if the number is beyond +/- Max range
	    noMoreRecordsSw = checkNoMoreRecordsSwMaxLimit(number); 
	}

	public void setNoMoreRecordsSw(int number) {
	    number = checkNoMoreRecordsSwMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setNoMoreRecordsSw((short)number);
	}
	public void setNoMoreRecordsSw(long number) {
	    number = checkNoMoreRecordsSwMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setNoMoreRecordsSw((short)number);
	}
	

	
	/**
	 *	Test condition 1 for isNoMoreRecords()
	 *	@return  Returns true if isNoMoreRecords() is 1
	 */
   public boolean isNoMoreRecords() throws CFException {
      return (  getNoMoreRecordsSw()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setNoMoreRecordsTrue() {  			
    	setNoMoreRecordsSw( (short)1);
   	}
	/**
	 *	Returns the value of eofSw
	 *	@return eofSw
	 */
   public char[] getEofSw() throws CFException{
   		return eofSw;
   }

  
	/**
	*  set variable eofSw
	*  Corresponding COBOL Variable is WS-EOF-SW
	*  @param value
	**/
   public void setEofSw(char[] value) {
       value = checkEofSwConstraints(value);
       arraycopy(value,0,eofSw,0,value.length);
   } 
	public void setEofSw(char[] value , int beginIndex, int endIndex) {
       //value = checkL1CtlData801Constraints(value);
       arraycopy(value,beginIndex,eofSw,0,beginIndex + endIndex);
   }
	char[] endOfClientData88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isEndOfClientData()
	 *	@return  Returns true if isEndOfClientData() is "Y"
	 */
   public boolean isEndOfClientData() throws CFException {
      return (  compareChars( getEofSw() , endOfClientData88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setEndOfClientDataTrue() {  			
    	setEofSw( endOfClientData88Value);
   	}

	
	
	

		public static int getWorkFieldLength() {
			return WORK_LENGTH;
		}

}
  

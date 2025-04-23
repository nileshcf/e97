package com.cloudframe.app.ip305710.dto;

/**
*  The class MaxRrnLimitErr620 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:31. using version 5.0.0.254
**/


import com.cloudframe.app.ip305710.dto.serialize.*;
import com.cloudframe.app.exception.CFException;


public class MaxRrnLimitErr620 extends MaxRrnLimitErr620Serialized {
   


								private int maxRrnLimit620;


								private long pcCapGrpPtr620;


								private int actualRrnLimit620;
	
	/**
	* Constructor for MaxRrnLimitErr620
	**/
    public MaxRrnLimitErr620() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("EXCEED MAX RRN LIMIT OF ").toCharArray()
             , getStartOffset() + 0
             ,24
             );
								setMaxRrnLimit620(0);
       replaceValue( // serialize and save the value
             (" FOR PC CAP GRP PTR=").toCharArray()
             , getStartOffset() + 26
             ,20
             );
								setPcCapGrpPtr620(0L);
       replaceValue( // serialize and save the value
             (".ACTUAL RRN LIMIT=").toCharArray()
             , getStartOffset() + 57
             ,18
             );
								setActualRrnLimit620(0);
    }


 

	/**
	 *	Returns the value of maxRrnLimit620
	 *	@return maxRrnLimit620
	 */
	public int getMaxRrnLimit620() throws CFException {
       if (isMaxRrnLimit620Modified()) { 
           maxRrnLimit620 = refreshMaxRrnLimit620();
        }
   		return maxRrnLimit620;
	}
	

	
	   
	/**
	 * 	Update MaxRrnLimit620 with the passed value
	 *  Corresponding COBOL Variable is 620-MAX-RRN-LIMIT
	 *	@param number
	 */
	public void setMaxRrnLimit620(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    maxRrnLimit620 = checkMaxRrnLimit620MaxLimit(number); 
		serializeMaxRrnLimit620(maxRrnLimit620);
	}
	

	public void setMaxRrnLimit620(long number) {
	    number = checkMaxRrnLimit620MaxLimit(number); // Truncate if value is beyond +/- Max range
		setMaxRrnLimit620((int)number);
	}
	
	/**
	 * 	Update MaxRrnLimit620 with the passed value
	 *	@param value (String or char[])
	 */
	public void setMaxRrnLimit620(char[] value) throws CFException {
		 maxRrnLimit620 = serializeMaxRrnLimit620(value);
	}
	/**
	 * 	Update MaxRrnLimit620 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMaxRrnLimit620String(char[] value) throws CFException {
		 setMaxRrnLimit620(value);
	}
	/**
	 *	Returns the value of pcCapGrpPtr620
	 *	@return pcCapGrpPtr620
	 */
	public long getPcCapGrpPtr620() throws CFException {
       if (isPcCapGrpPtr620Modified()) { 
           pcCapGrpPtr620 = refreshPcCapGrpPtr620();
        }
   		return pcCapGrpPtr620;
	}
	

	
	   
	/**
	 * 	Update PcCapGrpPtr620 with the passed value
	 *  Corresponding COBOL Variable is 620-PC-CAP-GRP-PTR
	 *	@param number
	 */
	public void setPcCapGrpPtr620(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    pcCapGrpPtr620 = checkPcCapGrpPtr620MaxLimit(number); 
		serializePcCapGrpPtr620(pcCapGrpPtr620);
	}
	

	/**
	 * 	Update PcCapGrpPtr620 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPcCapGrpPtr620(char[] value) throws CFException {
		 pcCapGrpPtr620 = serializePcCapGrpPtr620(value);
	}
	/**
	 * 	Update PcCapGrpPtr620 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPcCapGrpPtr620String(char[] value) throws CFException {
		 setPcCapGrpPtr620(value);
	}
	/**
	 *	Returns the value of actualRrnLimit620
	 *	@return actualRrnLimit620
	 */
	public int getActualRrnLimit620() throws CFException {
       if (isActualRrnLimit620Modified()) { 
           actualRrnLimit620 = refreshActualRrnLimit620();
        }
   		return actualRrnLimit620;
	}
	

	
	   
	/**
	 * 	Update ActualRrnLimit620 with the passed value
	 *  Corresponding COBOL Variable is 620-ACTUAL-RRN-LIMIT
	 *	@param number
	 */
	public void setActualRrnLimit620(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    actualRrnLimit620 = checkActualRrnLimit620MaxLimit(number); 
		serializeActualRrnLimit620(actualRrnLimit620);
	}
	

	public void setActualRrnLimit620(long number) {
	    number = checkActualRrnLimit620MaxLimit(number); // Truncate if value is beyond +/- Max range
		setActualRrnLimit620((int)number);
	}
	
	/**
	 * 	Update ActualRrnLimit620 with the passed value
	 *	@param value (String or char[])
	 */
	public void setActualRrnLimit620(char[] value) throws CFException {
		 actualRrnLimit620 = serializeActualRrnLimit620(value);
	}
	/**
	 * 	Update ActualRrnLimit620 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setActualRrnLimit620String(char[] value) throws CFException {
		 setActualRrnLimit620(value);
	}

	
	
	

		public static int getMaxRrnLimitErr620FieldLength() {
			return MAX_RRN_LIMIT_ERR_620_LENGTH;
		}

}
  

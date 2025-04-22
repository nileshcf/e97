package com.cloudframe.app.ar640010.dto;

/**
*  The class PgmTime800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class PgmTime800 extends PgmTime800Serialized { 
   

								private int pgmHour800;


								private int pgmMinute800;


								private int pgmSecond800;

				private PgmMillisecond800 pgmMillisecond800 = new PgmMillisecond800();
	
	/**
	* Constructor for PgmTime800
	**/
    public PgmTime800() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for PgmTime800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public PgmTime800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			pgmMillisecond800.setParent(this,getStartOffset() + 9);
								setPgmHour800(0);
       replaceValue( // serialize and save the value
             (".").toCharArray()
             , getStartOffset() + 2
             ,1
             );
								setPgmMinute800(0);
       replaceValue( // serialize and save the value
             (".").toCharArray()
             , getStartOffset() + 5
             ,1
             );
								setPgmSecond800(0);
       replaceValue( // serialize and save the value
             (".").toCharArray()
             , getStartOffset() + 8
             ,1
             );
    } 

	/**
	 *	Returns the value of pgmHour800
	 *	@return pgmHour800
	 */
	public int getPgmHour800() throws CFException {
       if (isPgmHour800Modified()) { 
           pgmHour800 = refreshPgmHour800();
        }
   		return pgmHour800;
	}
	

	
	   
	/**
	 * 	Update PgmHour800 with the passed value
	 *  Corresponding COBOL Variable is 800-PGM-HOUR
	 *	@param number
	 */
	public void setPgmHour800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    pgmHour800 = checkPgmHour800MaxLimit(number); 
		serializePgmHour800(pgmHour800);
	}
	

	public void setPgmHour800(long number) {
	    number = checkPgmHour800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setPgmHour800((int)number);
	}
	
	/**
	 * 	Update PgmHour800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPgmHour800(char[] value) throws CFException {
		 pgmHour800 = serializePgmHour800(value);
	}
	/**
	 * 	Update PgmHour800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPgmHour800String(char[] value) throws CFException {
		 setPgmHour800(value);
	}
	/**
	 *	Returns the value of pgmMinute800
	 *	@return pgmMinute800
	 */
	public int getPgmMinute800() throws CFException {
       if (isPgmMinute800Modified()) { 
           pgmMinute800 = refreshPgmMinute800();
        }
   		return pgmMinute800;
	}
	

	
	   
	/**
	 * 	Update PgmMinute800 with the passed value
	 *  Corresponding COBOL Variable is 800-PGM-MINUTE
	 *	@param number
	 */
	public void setPgmMinute800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    pgmMinute800 = checkPgmMinute800MaxLimit(number); 
		serializePgmMinute800(pgmMinute800);
	}
	

	public void setPgmMinute800(long number) {
	    number = checkPgmMinute800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setPgmMinute800((int)number);
	}
	
	/**
	 * 	Update PgmMinute800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPgmMinute800(char[] value) throws CFException {
		 pgmMinute800 = serializePgmMinute800(value);
	}
	/**
	 * 	Update PgmMinute800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPgmMinute800String(char[] value) throws CFException {
		 setPgmMinute800(value);
	}
	/**
	 *	Returns the value of pgmSecond800
	 *	@return pgmSecond800
	 */
	public int getPgmSecond800() throws CFException {
       if (isPgmSecond800Modified()) { 
           pgmSecond800 = refreshPgmSecond800();
        }
   		return pgmSecond800;
	}
	

	
	   
	/**
	 * 	Update PgmSecond800 with the passed value
	 *  Corresponding COBOL Variable is 800-PGM-SECOND
	 *	@param number
	 */
	public void setPgmSecond800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    pgmSecond800 = checkPgmSecond800MaxLimit(number); 
		serializePgmSecond800(pgmSecond800);
	}
	

	public void setPgmSecond800(long number) {
	    number = checkPgmSecond800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setPgmSecond800((int)number);
	}
	
	/**
	 * 	Update PgmSecond800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPgmSecond800(char[] value) throws CFException {
		 pgmSecond800 = serializePgmSecond800(value);
	}
	/**
	 * 	Update PgmSecond800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPgmSecond800String(char[] value) throws CFException {
		 setPgmSecond800(value);
	}
	/**
	 *	Returns the value of pgmMillisecond800
	 *	@return pgmMillisecond800
	 */   
	 public PgmMillisecond800 getPgmMillisecond800() {
   	return pgmMillisecond800;
   }
   /**
	* 	Update PgmMillisecond800 with the passed value
	*   Corresponding COBOL Variable is 800-PGM-MILLISECOND
	*	@param value
	*/
   public void setPgmMillisecond800(char[] value) {
      pgmMillisecond800.setString(value); 
   }   
    
     /**
	 * 	Update PgmMillisecond800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setPgmMillisecond800(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,pgmMillisecond800.begin,pgmMillisecond800.length());
   }
   
     /**
	 * 	Update PgmMillisecond800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPgmMillisecond800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,pgmMillisecond800.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update PgmMillisecond800 with another Field
	 *	@param value
	 */
   public void setPgmMillisecond800(Field source) {
   	replace(source,0,source.length(),pgmMillisecond800.begin,pgmMillisecond800.length());
   }  
   
     /**
	 * 	Update PgmMillisecond800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setPgmMillisecond800(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,pgmMillisecond800.begin,pgmMillisecond800.length());
   }
   
     /**
	 * 	Update PgmMillisecond800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPgmMillisecond800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,pgmMillisecond800.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getPgmTime800FieldLength() {
			return PGM_TIME_800_LENGTH;
		}

}
  

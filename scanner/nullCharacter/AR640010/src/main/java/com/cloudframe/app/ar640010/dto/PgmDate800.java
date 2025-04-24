package com.cloudframe.app.ar640010.dto;

/**
*  The class PgmDate800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:49. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class PgmDate800 extends PgmDate800Serialized { 
   

								private int pgmYear800;


								private int pgmMonth800;


								private int pgmDay800;
	
	/**
	* Constructor for PgmDate800
	**/
    public PgmDate800() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for PgmDate800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public PgmDate800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setPgmYear800(0);
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 4
             ,1
             );
								setPgmMonth800(0);
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 7
             ,1
             );
								setPgmDay800(0);
    } 

	/**
	 *	Returns the value of pgmYear800
	 *	@return pgmYear800
	 */
	public int getPgmYear800() throws CFException {
       if (isPgmYear800Modified()) { 
           pgmYear800 = refreshPgmYear800();
        }
   		return pgmYear800;
	}
	

	
	   
	/**
	 * 	Update PgmYear800 with the passed value
	 *  Corresponding COBOL Variable is 800-PGM-YEAR
	 *	@param number
	 */
	public void setPgmYear800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    pgmYear800 = checkPgmYear800MaxLimit(number); 
		serializePgmYear800(pgmYear800);
	}
	

	public void setPgmYear800(long number) {
	    number = checkPgmYear800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setPgmYear800((int)number);
	}
	
	/**
	 * 	Update PgmYear800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPgmYear800(char[] value) throws CFException {
		 pgmYear800 = serializePgmYear800(value);
	}
	/**
	 * 	Update PgmYear800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPgmYear800String(char[] value) throws CFException {
		 setPgmYear800(value);
	}
	/**
	 *	Returns the value of pgmMonth800
	 *	@return pgmMonth800
	 */
	public int getPgmMonth800() throws CFException {
       if (isPgmMonth800Modified()) { 
           pgmMonth800 = refreshPgmMonth800();
        }
   		return pgmMonth800;
	}
	

	
	   
	/**
	 * 	Update PgmMonth800 with the passed value
	 *  Corresponding COBOL Variable is 800-PGM-MONTH
	 *	@param number
	 */
	public void setPgmMonth800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    pgmMonth800 = checkPgmMonth800MaxLimit(number); 
		serializePgmMonth800(pgmMonth800);
	}
	

	public void setPgmMonth800(long number) {
	    number = checkPgmMonth800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setPgmMonth800((int)number);
	}
	
	/**
	 * 	Update PgmMonth800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPgmMonth800(char[] value) throws CFException {
		 pgmMonth800 = serializePgmMonth800(value);
	}
	/**
	 * 	Update PgmMonth800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPgmMonth800String(char[] value) throws CFException {
		 setPgmMonth800(value);
	}
	/**
	 *	Returns the value of pgmDay800
	 *	@return pgmDay800
	 */
	public int getPgmDay800() throws CFException {
       if (isPgmDay800Modified()) { 
           pgmDay800 = refreshPgmDay800();
        }
   		return pgmDay800;
	}
	

	
	   
	/**
	 * 	Update PgmDay800 with the passed value
	 *  Corresponding COBOL Variable is 800-PGM-DAY
	 *	@param number
	 */
	public void setPgmDay800(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    pgmDay800 = checkPgmDay800MaxLimit(number); 
		serializePgmDay800(pgmDay800);
	}
	

	public void setPgmDay800(long number) {
	    number = checkPgmDay800MaxLimit(number); // Truncate if value is beyond +/- Max range
		setPgmDay800((int)number);
	}
	
	/**
	 * 	Update PgmDay800 with the passed value
	 *	@param value (String or char[])
	 */
	public void setPgmDay800(char[] value) throws CFException {
		 pgmDay800 = serializePgmDay800(value);
	}
	/**
	 * 	Update PgmDay800 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setPgmDay800String(char[] value) throws CFException {
		 setPgmDay800(value);
	}

	
	
	

		public static int getPgmDate800FieldLength() {
			return PGM_DATE_800_LENGTH;
		}

}
  

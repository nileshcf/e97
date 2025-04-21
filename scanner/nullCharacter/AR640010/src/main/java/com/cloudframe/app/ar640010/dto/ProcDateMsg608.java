package com.cloudframe.app.ar640010.dto;

/**
*  The class ProcDateMsg608 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ProcDateMsg608 extends ProcDateMsg608Serialized {
   


						private char[] procDate608 = new char[10];


								private int procJulDay608;

	
	/**
	* Constructor for ProcDateMsg608
	**/
    public ProcDateMsg608() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             (", PROCESS DATE: ").toCharArray()
             , getStartOffset() + 0
             ,16
             );
								setProcDate608(fillSpace(10));
       replaceValue( // serialize and save the value
             (" (").toCharArray()
             , getStartOffset() + 26
             ,2
             );
								setProcJulDay608(0);
       replaceValue( // serialize and save the value
             (")").toCharArray()
             , getStartOffset() + 31
             ,1
             );
    }


 

	/**
	 *	Returns the value of procDate608
	 *	@return procDate608
	 */
   public char[] getProcDate608() throws CFException{
     if (isProcDate608Modified()) { 
        procDate608 = refreshProcDate608();
     }
   		return procDate608;
   }

  
	/**
	*  set variable procDate608
	*  Corresponding COBOL Variable is 608-PROC-DATE
	*  @param value
	**/
   public void setProcDate608(char[] value) {
      procDate608 = checkProcDate608Constraints(value);
      serializeProcDate608(procDate608);
   } 

     /**
	 * 	Update ProcDate608 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setProcDate608(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginProcDate608,procDate608.length);
   	
   }
   
   public void setProcDate608(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginProcDate608,procDate608.length);
   	
   }
   
     /**
	 * 	Update ProcDate608 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setProcDate608(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginProcDate608+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ProcDate608 with another Field
	 *	@param value
	 */
   public void setProcDate608(Field source) {
       replace(source,0,source.length(),beginProcDate608,PROC_DATE_608_LEN);
   	
   }  
   
     /**
	 * 	Update ProcDate608 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setProcDate608(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginProcDate608,PROC_DATE_608_LEN);
   	
   }
   
     /**
	 * 	Update ProcDate608 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setProcDate608(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginProcDate608+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of procJulDay608
	 *	@return procJulDay608
	 */
	public int getProcJulDay608() throws CFException {
       if (isProcJulDay608Modified()) { 
           procJulDay608 = refreshProcJulDay608();
        }
   		return procJulDay608;
	}
	

	
	   
	/**
	 * 	Update ProcJulDay608 with the passed value
	 *  Corresponding COBOL Variable is 608-PROC-JUL-DAY
	 *	@param number
	 */
	public void setProcJulDay608(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    procJulDay608 = checkProcJulDay608MaxLimit(number); 
		serializeProcJulDay608(procJulDay608);
	}
	

	public void setProcJulDay608(long number) {
	    number = checkProcJulDay608MaxLimit(number); // Truncate if value is beyond +/- Max range
		setProcJulDay608((int)number);
	}
	
	/**
	 * 	Update ProcJulDay608 with the passed value
	 *	@param value (String or char[])
	 */
	public void setProcJulDay608(char[] value) throws CFException {
		 procJulDay608 = serializeProcJulDay608(value);
	}
	/**
	 * 	Update ProcJulDay608 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setProcJulDay608String(char[] value) throws CFException {
		 setProcJulDay608(value);
	}

	
	
	

		public static int getProcDateMsg608FieldLength() {
			return PROC_DATE_MSG_608_LENGTH;
		}

}
  

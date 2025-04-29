package com.cloudframe.app.ms00d363.dto;

/**
*  The class MonthNameTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:35. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MonthNameTable extends MonthNameTableSerialized {
   

								private int mntMaxOccurs;

						private char[] mntLiterals = new char[132];
				private MntArea mntArea = new MntArea();
	
	/**
	* Constructor for MonthNameTable
	**/
    public MonthNameTable() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			mntArea.setParent(this,getStartOffset() + 2);
	   	/*  end of offset */
								setMntMaxOccurs(12);
								setMntLiterals("    JANUARY   FEBRUARY      MARCH      APRIL        MAY       JUNE       JULY     AUGUST  SEPTEMBER    OCTOBER   NOVEMBER   DECEMBER".toCharArray());
    }


 

	/**
	 *	Returns the value of mntMaxOccurs
	 *	@return mntMaxOccurs
	 */
	public int getMntMaxOccurs() throws CFException {
       if (isMntMaxOccursModified()) { 
           mntMaxOccurs = refreshMntMaxOccurs();
        }
   		return mntMaxOccurs;
	}
	

	
	   
	/**
	 * 	Update MntMaxOccurs with the passed value
	 *  Corresponding COBOL Variable is MNT-MAX-OCCURS
	 *	@param number
	 */
	public void setMntMaxOccurs(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    mntMaxOccurs = checkMntMaxOccursMaxLimit(number); 
		serializeMntMaxOccurs(mntMaxOccurs);
	}
	

	public void setMntMaxOccurs(long number) {
	    number = checkMntMaxOccursMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMntMaxOccurs((int)number);
	}
	
	/**
	 * 	Update MntMaxOccurs with the passed value
	 *	@param value (String or char[])
	 */
	public void setMntMaxOccurs(char[] value) throws CFException {
		 mntMaxOccurs = serializeMntMaxOccurs(value);
	}
	/**
	 * 	Update MntMaxOccurs with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMntMaxOccursString(char[] value) throws CFException {
		 setMntMaxOccurs(value);
	}
	/**
	 *	Returns the value of mntLiterals
	 *	@return mntLiterals
	 */
   public char[] getMntLiterals() throws CFException{
     if (isMntLiteralsModified()) { 
        mntLiterals = refreshMntLiterals();
     }
   		return mntLiterals;
   }

  
	/**
	*  set variable mntLiterals
	*  Corresponding COBOL Variable is MNT-LITERALS
	*  @param value
	**/
   public void setMntLiterals(char[] value) {
      mntLiterals = checkMntLiteralsConstraints(value);
      serializeMntLiterals(mntLiterals);
   } 

     /**
	 * 	Update MntLiterals 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMntLiterals(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMntLiterals,mntLiterals.length);
   	
   }
   
   public void setMntLiterals(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMntLiterals,mntLiterals.length);
   	
   }
   
     /**
	 * 	Update MntLiterals 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMntLiterals(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMntLiterals+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MntLiterals with another Field
	 *	@param value
	 */
   public void setMntLiterals(Field source) {
       replace(source,0,source.length(),beginMntLiterals,MNT_LITERALS_LEN);
   	
   }  
   
     /**
	 * 	Update MntLiterals 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMntLiterals(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMntLiterals,MNT_LITERALS_LEN);
   	
   }
   
     /**
	 * 	Update MntLiterals 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMntLiterals(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMntLiterals+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mntArea
	 *	@return mntArea
	 */   
	 public MntArea getMntArea() {
   	return mntArea;
   }
   /**
	* 	Update MntArea with the passed value
	*   Corresponding COBOL Variable is MNT-AREA
	*	@param value
	*/
   public void setMntArea(char[] value) {
      mntArea.setString(value); 
   }   
    
     /**
	 * 	Update MntArea 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMntArea(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,mntArea.begin,mntArea.length());
   }
   
     /**
	 * 	Update MntArea 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMntArea(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,mntArea.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MntArea with another Field
	 *	@param value
	 */
   public void setMntArea(Field source) {
   	replace(source,0,source.length(),mntArea.begin,mntArea.length());
   }  
   
     /**
	 * 	Update MntArea 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMntArea(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,mntArea.begin,mntArea.length());
   }
   
     /**
	 * 	Update MntArea 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMntArea(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,mntArea.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getMonthNameTableFieldLength() {
			return MONTH_NAME_TABLE_LENGTH;
		}

}
  

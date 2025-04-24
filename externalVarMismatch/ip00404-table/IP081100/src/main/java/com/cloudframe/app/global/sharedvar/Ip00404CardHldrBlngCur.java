package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00404CardHldrBlngCur is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:40. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;


public class Ip00404CardHldrBlngCur extends Ip00404CardHldrBlngCurSerialized { 
   

								private int ip00404CardMastDfltCur;

								private int ip00404CardMastDfltExp;
			private List<Ip00404PrimaryCrncyTbl> ip00404PrimaryCrncyTbl = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip00404CardHldrBlngCur
	**/
    public Ip00404CardHldrBlngCur() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip00404CardHldrBlngCur. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00404CardHldrBlngCur(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip00404CardMastDfltCur
	 *	@return ip00404CardMastDfltCur
	 */
	public int getIp00404CardMastDfltCur() throws CFException {
       if (isIp00404CardMastDfltCurModified()) { 
           ip00404CardMastDfltCur = refreshIp00404CardMastDfltCur();
        }
   		return ip00404CardMastDfltCur;
	}
	

	
	   
	/**
	 * 	Update Ip00404CardMastDfltCur with the passed value
	 *  Corresponding COBOL Variable is IP00404-CARD-MAST-DFLT-CUR
	 *	@param number
	 */
	public void setIp00404CardMastDfltCur(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip00404CardMastDfltCur = checkIp00404CardMastDfltCurMaxLimit(number); 
		serializeIp00404CardMastDfltCur(ip00404CardMastDfltCur);
	}
	

	public void setIp00404CardMastDfltCur(long number) {
	    number = checkIp00404CardMastDfltCurMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp00404CardMastDfltCur((int)number);
	}
	
	/**
	 * 	Update Ip00404CardMastDfltCur with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00404CardMastDfltCur(char[] value) throws CFException {
		 ip00404CardMastDfltCur = serializeIp00404CardMastDfltCur(value);
	}
	/**
	 * 	Update Ip00404CardMastDfltCur with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00404CardMastDfltCurString(char[] value) throws CFException {
		 setIp00404CardMastDfltCur(value);
	}
	/**
	 *	Returns the value of ip00404CardMastDfltExp
	 *	@return ip00404CardMastDfltExp
	 */
	public int getIp00404CardMastDfltExp() throws CFException {
       if (isIp00404CardMastDfltExpModified()) { 
           ip00404CardMastDfltExp = refreshIp00404CardMastDfltExp();
        }
   		return ip00404CardMastDfltExp;
	}
	

	
	   
	/**
	 * 	Update Ip00404CardMastDfltExp with the passed value
	 *  Corresponding COBOL Variable is IP00404-CARD-MAST-DFLT-EXP
	 *	@param number
	 */
	public void setIp00404CardMastDfltExp(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    ip00404CardMastDfltExp = checkIp00404CardMastDfltExpMaxLimit(number); 
		serializeIp00404CardMastDfltExp(ip00404CardMastDfltExp);
	}
	

	public void setIp00404CardMastDfltExp(long number) {
	    number = checkIp00404CardMastDfltExpMaxLimit(number); // Truncate if value is beyond +/- Max range
		setIp00404CardMastDfltExp((int)number);
	}
	
	/**
	 * 	Update Ip00404CardMastDfltExp with the passed value
	 *	@param value (String or char[])
	 */
	public void setIp00404CardMastDfltExp(char[] value) throws CFException {
		 ip00404CardMastDfltExp = serializeIp00404CardMastDfltExp(value);
	}
	/**
	 * 	Update Ip00404CardMastDfltExp with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setIp00404CardMastDfltExpString(char[] value) throws CFException {
		 setIp00404CardMastDfltExp(value);
	}
	/**
	 *	Returns the  value of ip00404PrimaryCrncyTbl
	 *  Corresponding COBOL Variable is IP00404-PRIMARY-CRNCY-TBL
	 *	@return ip00404PrimaryCrncyTbl
	 */
   public List<Ip00404PrimaryCrncyTbl> getIp00404PrimaryCrncyTbl() {
       return ip00404PrimaryCrncyTbl;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return ip00404PrimaryCrncyTbl
	 */
	public Ip00404PrimaryCrncyTbl getIp00404PrimaryCrncyTbl(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getIp00404PrimaryCrncyTbl(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= IP_00404_PRIMARY_CRNCY_TBL_SIZE) {
             	index = IP_00404_PRIMARY_CRNCY_TBL_SIZE -1; // can't exceed max array size
             	logger.trace("ip00404PrimaryCrncyTbl - Array index exceeded max Size {}, resetting it to max allowed",IP_00404_PRIMARY_CRNCY_TBL_SIZE); 
	    }
		if (index >= ip00404PrimaryCrncyTbl.size()) {
       		for (int fillIndex =  ip00404PrimaryCrncyTbl.size() -1; fillIndex < index;fillIndex++) {
		       ip00404PrimaryCrncyTbl.add(null);
		    }
			ip00404PrimaryCrncyTbl.set(index,
			   	   	new Ip00404PrimaryCrncyTbl(this,beginIp00404PrimaryCrncyTbl + index * Ip00404PrimaryCrncyTbl.getIp00404PrimaryCrncyTblFieldLength()) 
				                        ); 	
		} 
   	   Ip00404PrimaryCrncyTbl value = ip00404PrimaryCrncyTbl.get(index);
   	   if (value == null) {
   	      ip00404PrimaryCrncyTbl.set(index,
			   	   	new Ip00404PrimaryCrncyTbl(this,beginIp00404PrimaryCrncyTbl + index * Ip00404PrimaryCrncyTbl.getIp00404PrimaryCrncyTblFieldLength()) 
				                        ); 
		  value = ip00404PrimaryCrncyTbl.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Ip00404PrimaryCrncyTbl at index with the passed value
	 *  Corresponding COBOL Variable is IP00404-PRIMARY-CRNCY-TBL
	 *  @param index
	 *	@param value
	 */
  public void setIp00404PrimaryCrncyTbl(int index,char[] value) {
   	getIp00404PrimaryCrncyTbl(index).setString(value);
   }
   
	

	
	
	
	/**
	 * 	initializes Ip00404CardHldrBlngCur
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp00404CardMastDfltCur(0);
                     setIp00404CardMastDfltExp(0);
     if (ip00404PrimaryCrncyTbl.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_00404_PRIMARY_CRNCY_TBL_SIZE;index++) {
              Ip00404PrimaryCrncyTbl  newElement = new Ip00404PrimaryCrncyTbl(this,beginIp00404PrimaryCrncyTbl + index * Ip00404PrimaryCrncyTbl.getIp00404PrimaryCrncyTblFieldLength());
              newElement.initialize();
               ip00404PrimaryCrncyTbl.add(newElement);
          }
     } else {
        if (ip00404PrimaryCrncyTbl.size() < IP_00404_PRIMARY_CRNCY_TBL_SIZE) {
          // prefill it first
          for (int index = ip00404PrimaryCrncyTbl.size();index <  IP_00404_PRIMARY_CRNCY_TBL_SIZE;index++) {
              Ip00404PrimaryCrncyTbl  newElement = new Ip00404PrimaryCrncyTbl(this,beginIp00404PrimaryCrncyTbl + index * Ip00404PrimaryCrncyTbl.getIp00404PrimaryCrncyTblFieldLength());
               ip00404PrimaryCrncyTbl.add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_00404_PRIMARY_CRNCY_TBL_SIZE;index++) {
     		Ip00404PrimaryCrncyTbl ip00404PrimaryCrncyTblVar = ip00404PrimaryCrncyTbl.get(index);
 			if (ip00404PrimaryCrncyTblVar == null) {
                ip00404PrimaryCrncyTblVar = new Ip00404PrimaryCrncyTbl(this,beginIp00404PrimaryCrncyTbl + index * Ip00404PrimaryCrncyTbl.getIp00404PrimaryCrncyTblFieldLength());
                  ip00404PrimaryCrncyTbl.set(index, ip00404PrimaryCrncyTblVar);
			} 
			ip00404PrimaryCrncyTblVar.initialize();
		}
     }
   }

		public static int getIp00404CardHldrBlngCurFieldLength() {
			return IP_00404_CARD_HLDR_BLNG_CUR_LENGTH;
		}

}
  

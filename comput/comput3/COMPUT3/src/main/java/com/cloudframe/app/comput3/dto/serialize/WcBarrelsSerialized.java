package com.cloudframe.app.comput3.dto.serialize;

/**
*  The class WcBarrelsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:50. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class WcBarrelsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WcBarrelsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WC_BARRELS_LENGTH = 108;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWcBblBbl;
            protected  int beginWcBblKb;
            protected  int beginWcBblLit;
            protected  int beginWcBblM3;
            protected  int beginWcBblUsg;
            protected  int beginWcBblUkg;
            protected  int beginWcBblMmb;
            protected  int beginWcBblGbt;
            protected  int beginWcBblThm;
            protected  int beginWcBblMwh;
            protected  int beginWcBblGj;
            protected  int beginWcBblDay;
	
	/**
	* Constructor for WcBarrelsSerialized
	**/
    public WcBarrelsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WcBarrelsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcBarrelsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WcBarrelsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this WcBarrelsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in WcBarrelsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WC_BARRELS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWcBblBbl = getStartOffset() + 0;	// set offset for serialization
  
             beginWcBblKb = getStartOffset() + 9;	// set offset for serialization
  
             beginWcBblLit = getStartOffset() + 18;	// set offset for serialization
  
             beginWcBblM3 = getStartOffset() + 27;	// set offset for serialization
  
             beginWcBblUsg = getStartOffset() + 36;	// set offset for serialization
  
             beginWcBblUkg = getStartOffset() + 45;	// set offset for serialization
  
             beginWcBblMmb = getStartOffset() + 54;	// set offset for serialization
  
             beginWcBblGbt = getStartOffset() + 63;	// set offset for serialization
  
             beginWcBblThm = getStartOffset() + 72;	// set offset for serialization
  
             beginWcBblMwh = getStartOffset() + 81;	// set offset for serialization
  
             beginWcBblGj = getStartOffset() + 90;	// set offset for serialization
  
             beginWcBblDay = getStartOffset() + 99;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localWcBblBblCounter = -1;
        public boolean isWcBblBblModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcBblBblCounter != sharedCounter;
           localWcBblBblCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcBblBblIsNumeric() {
	      return decimalIsNumeric(beginWcBblBbl,WC_BBL_BBL_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcBblBblString() {
            return getPackedString(beginWcBblBbl,WC_BBL_BBL_LEN);
         }
   protected static final int WC_BBL_BBL_LEN = 9;
   protected static final int WC_BBL_BBL_SCALE = 4;
  	/**
	 * 	serializeWcBblBbl
	 */
	protected void serializeWcBblBbl(BigDecimal wcBblBbl) {
		   putDecimal(beginWcBblBbl,wcBblBbl,WC_BBL_BBL_LEN,WC_BBL_BBL_SCALE,true);
		 localWcBblBblCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcBblBblMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcBblBbl is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcBblBbl() throws CFException {	
   	try { 
		 return (getDecimal(beginWcBblBbl,WC_BBL_BBL_LEN,WC_BBL_BBL_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcBblBbl", beginWcBblBbl,WC_BBL_BBL_LEN);
     }
   	}
        int localWcBblKbCounter = -1;
        public boolean isWcBblKbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcBblKbCounter != sharedCounter;
           localWcBblKbCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcBblKbIsNumeric() {
	      return decimalIsNumeric(beginWcBblKb,WC_BBL_KB_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcBblKbString() {
            return getPackedString(beginWcBblKb,WC_BBL_KB_LEN);
         }
   protected static final int WC_BBL_KB_LEN = 9;
   protected static final int WC_BBL_KB_SCALE = 4;
  	/**
	 * 	serializeWcBblKb
	 */
	protected void serializeWcBblKb(BigDecimal wcBblKb) {
		   putDecimal(beginWcBblKb,wcBblKb,WC_BBL_KB_LEN,WC_BBL_KB_SCALE,true);
		 localWcBblKbCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcBblKbMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcBblKb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcBblKb() throws CFException {	
   	try { 
		 return (getDecimal(beginWcBblKb,WC_BBL_KB_LEN,WC_BBL_KB_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcBblKb", beginWcBblKb,WC_BBL_KB_LEN);
     }
   	}
        int localWcBblLitCounter = -1;
        public boolean isWcBblLitModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcBblLitCounter != sharedCounter;
           localWcBblLitCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcBblLitIsNumeric() {
	      return decimalIsNumeric(beginWcBblLit,WC_BBL_LIT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcBblLitString() {
            return getPackedString(beginWcBblLit,WC_BBL_LIT_LEN);
         }
   protected static final int WC_BBL_LIT_LEN = 9;
   protected static final int WC_BBL_LIT_SCALE = 4;
  	/**
	 * 	serializeWcBblLit
	 */
	protected void serializeWcBblLit(BigDecimal wcBblLit) {
		   putDecimal(beginWcBblLit,wcBblLit,WC_BBL_LIT_LEN,WC_BBL_LIT_SCALE,true);
		 localWcBblLitCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcBblLitMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcBblLit is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcBblLit() throws CFException {	
   	try { 
		 return (getDecimal(beginWcBblLit,WC_BBL_LIT_LEN,WC_BBL_LIT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcBblLit", beginWcBblLit,WC_BBL_LIT_LEN);
     }
   	}
        int localWcBblM3Counter = -1;
        public boolean isWcBblM3Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcBblM3Counter != sharedCounter;
           localWcBblM3Counter = sharedCounter; return hasModified; 
        }
	    public boolean wcBblM3IsNumeric() {
	      return decimalIsNumeric(beginWcBblM3,WC_BBL_M_3_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcBblM3String() {
            return getPackedString(beginWcBblM3,WC_BBL_M_3_LEN);
         }
   protected static final int WC_BBL_M_3_LEN = 9;
   protected static final int WC_BBL_M_3_SCALE = 4;
  	/**
	 * 	serializeWcBblM3
	 */
	protected void serializeWcBblM3(BigDecimal wcBblM3) {
		   putDecimal(beginWcBblM3,wcBblM3,WC_BBL_M_3_LEN,WC_BBL_M_3_SCALE,true);
		 localWcBblM3Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcBblM3MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcBblM3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcBblM3() throws CFException {	
   	try { 
		 return (getDecimal(beginWcBblM3,WC_BBL_M_3_LEN,WC_BBL_M_3_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcBblM3", beginWcBblM3,WC_BBL_M_3_LEN);
     }
   	}
        int localWcBblUsgCounter = -1;
        public boolean isWcBblUsgModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcBblUsgCounter != sharedCounter;
           localWcBblUsgCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcBblUsgIsNumeric() {
	      return decimalIsNumeric(beginWcBblUsg,WC_BBL_USG_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcBblUsgString() {
            return getPackedString(beginWcBblUsg,WC_BBL_USG_LEN);
         }
   protected static final int WC_BBL_USG_LEN = 9;
   protected static final int WC_BBL_USG_SCALE = 4;
  	/**
	 * 	serializeWcBblUsg
	 */
	protected void serializeWcBblUsg(BigDecimal wcBblUsg) {
		   putDecimal(beginWcBblUsg,wcBblUsg,WC_BBL_USG_LEN,WC_BBL_USG_SCALE,true);
		 localWcBblUsgCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcBblUsgMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcBblUsg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcBblUsg() throws CFException {	
   	try { 
		 return (getDecimal(beginWcBblUsg,WC_BBL_USG_LEN,WC_BBL_USG_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcBblUsg", beginWcBblUsg,WC_BBL_USG_LEN);
     }
   	}
        int localWcBblUkgCounter = -1;
        public boolean isWcBblUkgModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcBblUkgCounter != sharedCounter;
           localWcBblUkgCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcBblUkgIsNumeric() {
	      return decimalIsNumeric(beginWcBblUkg,WC_BBL_UKG_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcBblUkgString() {
            return getPackedString(beginWcBblUkg,WC_BBL_UKG_LEN);
         }
   protected static final int WC_BBL_UKG_LEN = 9;
   protected static final int WC_BBL_UKG_SCALE = 4;
  	/**
	 * 	serializeWcBblUkg
	 */
	protected void serializeWcBblUkg(BigDecimal wcBblUkg) {
		   putDecimal(beginWcBblUkg,wcBblUkg,WC_BBL_UKG_LEN,WC_BBL_UKG_SCALE,true);
		 localWcBblUkgCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcBblUkgMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcBblUkg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcBblUkg() throws CFException {	
   	try { 
		 return (getDecimal(beginWcBblUkg,WC_BBL_UKG_LEN,WC_BBL_UKG_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcBblUkg", beginWcBblUkg,WC_BBL_UKG_LEN);
     }
   	}
        int localWcBblMmbCounter = -1;
        public boolean isWcBblMmbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcBblMmbCounter != sharedCounter;
           localWcBblMmbCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcBblMmbIsNumeric() {
	      return decimalIsNumeric(beginWcBblMmb,WC_BBL_MMB_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcBblMmbString() {
            return getPackedString(beginWcBblMmb,WC_BBL_MMB_LEN);
         }
   protected static final int WC_BBL_MMB_LEN = 9;
   protected static final int WC_BBL_MMB_SCALE = 4;
  	/**
	 * 	serializeWcBblMmb
	 */
	protected void serializeWcBblMmb(BigDecimal wcBblMmb) {
		   putDecimal(beginWcBblMmb,wcBblMmb,WC_BBL_MMB_LEN,WC_BBL_MMB_SCALE,true);
		 localWcBblMmbCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcBblMmbMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcBblMmb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcBblMmb() throws CFException {	
   	try { 
		 return (getDecimal(beginWcBblMmb,WC_BBL_MMB_LEN,WC_BBL_MMB_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcBblMmb", beginWcBblMmb,WC_BBL_MMB_LEN);
     }
   	}
        int localWcBblGbtCounter = -1;
        public boolean isWcBblGbtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcBblGbtCounter != sharedCounter;
           localWcBblGbtCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcBblGbtIsNumeric() {
	      return decimalIsNumeric(beginWcBblGbt,WC_BBL_GBT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcBblGbtString() {
            return getPackedString(beginWcBblGbt,WC_BBL_GBT_LEN);
         }
   protected static final int WC_BBL_GBT_LEN = 9;
   protected static final int WC_BBL_GBT_SCALE = 4;
  	/**
	 * 	serializeWcBblGbt
	 */
	protected void serializeWcBblGbt(BigDecimal wcBblGbt) {
		   putDecimal(beginWcBblGbt,wcBblGbt,WC_BBL_GBT_LEN,WC_BBL_GBT_SCALE,true);
		 localWcBblGbtCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcBblGbtMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcBblGbt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcBblGbt() throws CFException {	
   	try { 
		 return (getDecimal(beginWcBblGbt,WC_BBL_GBT_LEN,WC_BBL_GBT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcBblGbt", beginWcBblGbt,WC_BBL_GBT_LEN);
     }
   	}
        int localWcBblThmCounter = -1;
        public boolean isWcBblThmModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcBblThmCounter != sharedCounter;
           localWcBblThmCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcBblThmIsNumeric() {
	      return decimalIsNumeric(beginWcBblThm,WC_BBL_THM_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcBblThmString() {
            return getPackedString(beginWcBblThm,WC_BBL_THM_LEN);
         }
   protected static final int WC_BBL_THM_LEN = 9;
   protected static final int WC_BBL_THM_SCALE = 4;
  	/**
	 * 	serializeWcBblThm
	 */
	protected void serializeWcBblThm(BigDecimal wcBblThm) {
		   putDecimal(beginWcBblThm,wcBblThm,WC_BBL_THM_LEN,WC_BBL_THM_SCALE,true);
		 localWcBblThmCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcBblThmMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcBblThm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcBblThm() throws CFException {	
   	try { 
		 return (getDecimal(beginWcBblThm,WC_BBL_THM_LEN,WC_BBL_THM_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcBblThm", beginWcBblThm,WC_BBL_THM_LEN);
     }
   	}
        int localWcBblMwhCounter = -1;
        public boolean isWcBblMwhModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcBblMwhCounter != sharedCounter;
           localWcBblMwhCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcBblMwhIsNumeric() {
	      return decimalIsNumeric(beginWcBblMwh,WC_BBL_MWH_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcBblMwhString() {
            return getPackedString(beginWcBblMwh,WC_BBL_MWH_LEN);
         }
   protected static final int WC_BBL_MWH_LEN = 9;
   protected static final int WC_BBL_MWH_SCALE = 4;
  	/**
	 * 	serializeWcBblMwh
	 */
	protected void serializeWcBblMwh(BigDecimal wcBblMwh) {
		   putDecimal(beginWcBblMwh,wcBblMwh,WC_BBL_MWH_LEN,WC_BBL_MWH_SCALE,true);
		 localWcBblMwhCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcBblMwhMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcBblMwh is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcBblMwh() throws CFException {	
   	try { 
		 return (getDecimal(beginWcBblMwh,WC_BBL_MWH_LEN,WC_BBL_MWH_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcBblMwh", beginWcBblMwh,WC_BBL_MWH_LEN);
     }
   	}
        int localWcBblGjCounter = -1;
        public boolean isWcBblGjModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcBblGjCounter != sharedCounter;
           localWcBblGjCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcBblGjIsNumeric() {
	      return decimalIsNumeric(beginWcBblGj,WC_BBL_GJ_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcBblGjString() {
            return getPackedString(beginWcBblGj,WC_BBL_GJ_LEN);
         }
   protected static final int WC_BBL_GJ_LEN = 9;
   protected static final int WC_BBL_GJ_SCALE = 4;
  	/**
	 * 	serializeWcBblGj
	 */
	protected void serializeWcBblGj(BigDecimal wcBblGj) {
		   putDecimal(beginWcBblGj,wcBblGj,WC_BBL_GJ_LEN,WC_BBL_GJ_SCALE,true);
		 localWcBblGjCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcBblGjMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcBblGj is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcBblGj() throws CFException {	
   	try { 
		 return (getDecimal(beginWcBblGj,WC_BBL_GJ_LEN,WC_BBL_GJ_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcBblGj", beginWcBblGj,WC_BBL_GJ_LEN);
     }
   	}
        int localWcBblDayCounter = -1;
        public boolean isWcBblDayModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcBblDayCounter != sharedCounter;
           localWcBblDayCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcBblDayIsNumeric() {
	      return decimalIsNumeric(beginWcBblDay,WC_BBL_DAY_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcBblDayString() {
            return getPackedString(beginWcBblDay,WC_BBL_DAY_LEN);
         }
   protected static final int WC_BBL_DAY_LEN = 9;
   protected static final int WC_BBL_DAY_SCALE = 4;
  	/**
	 * 	serializeWcBblDay
	 */
	protected void serializeWcBblDay(BigDecimal wcBblDay) {
		   putDecimal(beginWcBblDay,wcBblDay,WC_BBL_DAY_LEN,WC_BBL_DAY_SCALE,true);
		 localWcBblDayCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcBblDayMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcBblDay is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcBblDay() throws CFException {	
   	try { 
		 return (getDecimal(beginWcBblDay,WC_BBL_DAY_LEN,WC_BBL_DAY_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcBblDay", beginWcBblDay,WC_BBL_DAY_LEN);
     }
   	}




}
  

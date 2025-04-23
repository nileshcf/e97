package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup62Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:07. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup62Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup62Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_62_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P1892S;
            protected  int beginIp65504P1892L;
            protected  int beginIp65504P1893S;
            protected  int beginIp65504P1893L;
            protected  int beginIp65504P1894S;
            protected  int beginIp65504P1894L;
            protected  int beginIp65504P1895S;
            protected  int beginIp65504P1895L;
            protected  int beginIp65504P1896S;
            protected  int beginIp65504P1896L;
            protected  int beginIp65504P1897S;
            protected  int beginIp65504P1897L;
            protected  int beginIp65504P1898S;
            protected  int beginIp65504P1898L;
            protected  int beginIp65504P1899S;
            protected  int beginIp65504P1899L;
            protected  int beginIp65504P1900S;
            protected  int beginIp65504P1900L;
            protected  int beginIp65504P1901S;
            protected  int beginIp65504P1901L;
            protected  int beginIp65504P1902S;
            protected  int beginIp65504P1902L;
            protected  int beginIp65504P1903S;
            protected  int beginIp65504P1903L;
            protected  int beginIp65504P1904S;
            protected  int beginIp65504P1904L;
            protected  int beginIp65504P1905S;
            protected  int beginIp65504P1905L;
            protected  int beginIp65504P1906S;
            protected  int beginIp65504P1906L;
            protected  int beginIp65504P1907S;
            protected  int beginIp65504P1907L;
            protected  int beginIp65504P1908S;
            protected  int beginIp65504P1908L;
            protected  int beginIp65504P1909S;
            protected  int beginIp65504P1909L;
            protected  int beginIp65504P1910S;
            protected  int beginIp65504P1910L;
            protected  int beginIp65504P1911S;
            protected  int beginIp65504P1911L;
            protected  int beginIp65504P1912S;
            protected  int beginIp65504P1912L;
            protected  int beginIp65504P1913S;
            protected  int beginIp65504P1913L;
            protected  int beginIp65504P1914S;
            protected  int beginIp65504P1914L;
            protected  int beginIp65504P1915S;
            protected  int beginIp65504P1915L;
            protected  int beginIp65504P1916S;
            protected  int beginIp65504P1916L;
            protected  int beginIp65504P1917S;
            protected  int beginIp65504P1917L;
            protected  int beginIp65504P1918S;
            protected  int beginIp65504P1918L;
            protected  int beginIp65504P1919S;
            protected  int beginIp65504P1919L;
            protected  int beginIp65504P1920S;
            protected  int beginIp65504P1920L;
            protected  int beginIp65504P1921S;
            protected  int beginIp65504P1921L;
            protected  int beginIp65504P1922S;
            protected  int beginIp65504P1922L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup62Serialized
	**/
    public Ip65504PdsNamesLargeGroup62Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup62Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup62Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup62Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,15124); // serialize this field at offset 15124 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup62Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 15124 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup62Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_62_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P1892S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P1892L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P1893S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P1893L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P1894S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P1894L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P1895S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P1895L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P1896S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P1896L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P1897S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P1897L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P1898S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P1898L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P1899S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P1899L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P1900S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P1900L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P1901S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P1901L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P1902S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P1902L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P1903S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P1903L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P1904S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P1904L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P1905S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P1905L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P1906S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P1906L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P1907S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P1907L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P1908S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P1908L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P1909S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P1909L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P1910S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P1910L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P1911S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P1911L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P1912S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P1912L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P1913S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P1913L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P1914S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P1914L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P1915S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P1915L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P1916S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P1916L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P1917S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P1917L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P1918S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P1918L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P1919S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P1919L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P1920S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P1920L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P1921S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P1921L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P1922S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P1922L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P1892SCounter = -1;
         public boolean isIp65504P1892SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1892SCounter != sharedCounter;
            localIp65504P1892SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1892_S_LEN = 2;
  	/**
	 * serializeIp65504P1892S
	 */
	protected void serializeIp65504P1892S(short ip65504P1892S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1892S,IP_65504_P_1892_S_LEN)
                  ,beginIp65504P1892S
                  ,IP_65504_P_1892_S_LEN
                 );
            localIp65504P1892SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1892SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1892S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1892S() {	 
			return (getShort(beginIp65504P1892S));
   	}
         int localIp65504P1892LCounter = -1;
         public boolean isIp65504P1892LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1892LCounter != sharedCounter;
            localIp65504P1892LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1892_L_LEN = 2;
  	/**
	 * serializeIp65504P1892L
	 */
	protected void serializeIp65504P1892L(short ip65504P1892L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1892L,IP_65504_P_1892_L_LEN)
                  ,beginIp65504P1892L
                  ,IP_65504_P_1892_L_LEN
                 );
            localIp65504P1892LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1892LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1892L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1892L() {	 
			return (getShort(beginIp65504P1892L));
   	}
         int localIp65504P1893SCounter = -1;
         public boolean isIp65504P1893SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1893SCounter != sharedCounter;
            localIp65504P1893SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1893_S_LEN = 2;
  	/**
	 * serializeIp65504P1893S
	 */
	protected void serializeIp65504P1893S(short ip65504P1893S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1893S,IP_65504_P_1893_S_LEN)
                  ,beginIp65504P1893S
                  ,IP_65504_P_1893_S_LEN
                 );
            localIp65504P1893SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1893SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1893S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1893S() {	 
			return (getShort(beginIp65504P1893S));
   	}
         int localIp65504P1893LCounter = -1;
         public boolean isIp65504P1893LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1893LCounter != sharedCounter;
            localIp65504P1893LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1893_L_LEN = 2;
  	/**
	 * serializeIp65504P1893L
	 */
	protected void serializeIp65504P1893L(short ip65504P1893L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1893L,IP_65504_P_1893_L_LEN)
                  ,beginIp65504P1893L
                  ,IP_65504_P_1893_L_LEN
                 );
            localIp65504P1893LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1893LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1893L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1893L() {	 
			return (getShort(beginIp65504P1893L));
   	}
         int localIp65504P1894SCounter = -1;
         public boolean isIp65504P1894SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1894SCounter != sharedCounter;
            localIp65504P1894SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1894_S_LEN = 2;
  	/**
	 * serializeIp65504P1894S
	 */
	protected void serializeIp65504P1894S(short ip65504P1894S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1894S,IP_65504_P_1894_S_LEN)
                  ,beginIp65504P1894S
                  ,IP_65504_P_1894_S_LEN
                 );
            localIp65504P1894SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1894SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1894S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1894S() {	 
			return (getShort(beginIp65504P1894S));
   	}
         int localIp65504P1894LCounter = -1;
         public boolean isIp65504P1894LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1894LCounter != sharedCounter;
            localIp65504P1894LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1894_L_LEN = 2;
  	/**
	 * serializeIp65504P1894L
	 */
	protected void serializeIp65504P1894L(short ip65504P1894L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1894L,IP_65504_P_1894_L_LEN)
                  ,beginIp65504P1894L
                  ,IP_65504_P_1894_L_LEN
                 );
            localIp65504P1894LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1894LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1894L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1894L() {	 
			return (getShort(beginIp65504P1894L));
   	}
         int localIp65504P1895SCounter = -1;
         public boolean isIp65504P1895SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1895SCounter != sharedCounter;
            localIp65504P1895SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1895_S_LEN = 2;
  	/**
	 * serializeIp65504P1895S
	 */
	protected void serializeIp65504P1895S(short ip65504P1895S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1895S,IP_65504_P_1895_S_LEN)
                  ,beginIp65504P1895S
                  ,IP_65504_P_1895_S_LEN
                 );
            localIp65504P1895SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1895SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1895S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1895S() {	 
			return (getShort(beginIp65504P1895S));
   	}
         int localIp65504P1895LCounter = -1;
         public boolean isIp65504P1895LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1895LCounter != sharedCounter;
            localIp65504P1895LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1895_L_LEN = 2;
  	/**
	 * serializeIp65504P1895L
	 */
	protected void serializeIp65504P1895L(short ip65504P1895L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1895L,IP_65504_P_1895_L_LEN)
                  ,beginIp65504P1895L
                  ,IP_65504_P_1895_L_LEN
                 );
            localIp65504P1895LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1895LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1895L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1895L() {	 
			return (getShort(beginIp65504P1895L));
   	}
         int localIp65504P1896SCounter = -1;
         public boolean isIp65504P1896SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1896SCounter != sharedCounter;
            localIp65504P1896SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1896_S_LEN = 2;
  	/**
	 * serializeIp65504P1896S
	 */
	protected void serializeIp65504P1896S(short ip65504P1896S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1896S,IP_65504_P_1896_S_LEN)
                  ,beginIp65504P1896S
                  ,IP_65504_P_1896_S_LEN
                 );
            localIp65504P1896SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1896SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1896S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1896S() {	 
			return (getShort(beginIp65504P1896S));
   	}
         int localIp65504P1896LCounter = -1;
         public boolean isIp65504P1896LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1896LCounter != sharedCounter;
            localIp65504P1896LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1896_L_LEN = 2;
  	/**
	 * serializeIp65504P1896L
	 */
	protected void serializeIp65504P1896L(short ip65504P1896L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1896L,IP_65504_P_1896_L_LEN)
                  ,beginIp65504P1896L
                  ,IP_65504_P_1896_L_LEN
                 );
            localIp65504P1896LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1896LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1896L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1896L() {	 
			return (getShort(beginIp65504P1896L));
   	}
         int localIp65504P1897SCounter = -1;
         public boolean isIp65504P1897SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1897SCounter != sharedCounter;
            localIp65504P1897SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1897_S_LEN = 2;
  	/**
	 * serializeIp65504P1897S
	 */
	protected void serializeIp65504P1897S(short ip65504P1897S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1897S,IP_65504_P_1897_S_LEN)
                  ,beginIp65504P1897S
                  ,IP_65504_P_1897_S_LEN
                 );
            localIp65504P1897SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1897SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1897S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1897S() {	 
			return (getShort(beginIp65504P1897S));
   	}
         int localIp65504P1897LCounter = -1;
         public boolean isIp65504P1897LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1897LCounter != sharedCounter;
            localIp65504P1897LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1897_L_LEN = 2;
  	/**
	 * serializeIp65504P1897L
	 */
	protected void serializeIp65504P1897L(short ip65504P1897L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1897L,IP_65504_P_1897_L_LEN)
                  ,beginIp65504P1897L
                  ,IP_65504_P_1897_L_LEN
                 );
            localIp65504P1897LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1897LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1897L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1897L() {	 
			return (getShort(beginIp65504P1897L));
   	}
         int localIp65504P1898SCounter = -1;
         public boolean isIp65504P1898SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1898SCounter != sharedCounter;
            localIp65504P1898SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1898_S_LEN = 2;
  	/**
	 * serializeIp65504P1898S
	 */
	protected void serializeIp65504P1898S(short ip65504P1898S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1898S,IP_65504_P_1898_S_LEN)
                  ,beginIp65504P1898S
                  ,IP_65504_P_1898_S_LEN
                 );
            localIp65504P1898SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1898SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1898S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1898S() {	 
			return (getShort(beginIp65504P1898S));
   	}
         int localIp65504P1898LCounter = -1;
         public boolean isIp65504P1898LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1898LCounter != sharedCounter;
            localIp65504P1898LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1898_L_LEN = 2;
  	/**
	 * serializeIp65504P1898L
	 */
	protected void serializeIp65504P1898L(short ip65504P1898L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1898L,IP_65504_P_1898_L_LEN)
                  ,beginIp65504P1898L
                  ,IP_65504_P_1898_L_LEN
                 );
            localIp65504P1898LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1898LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1898L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1898L() {	 
			return (getShort(beginIp65504P1898L));
   	}
         int localIp65504P1899SCounter = -1;
         public boolean isIp65504P1899SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1899SCounter != sharedCounter;
            localIp65504P1899SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1899_S_LEN = 2;
  	/**
	 * serializeIp65504P1899S
	 */
	protected void serializeIp65504P1899S(short ip65504P1899S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1899S,IP_65504_P_1899_S_LEN)
                  ,beginIp65504P1899S
                  ,IP_65504_P_1899_S_LEN
                 );
            localIp65504P1899SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1899SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1899S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1899S() {	 
			return (getShort(beginIp65504P1899S));
   	}
         int localIp65504P1899LCounter = -1;
         public boolean isIp65504P1899LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1899LCounter != sharedCounter;
            localIp65504P1899LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1899_L_LEN = 2;
  	/**
	 * serializeIp65504P1899L
	 */
	protected void serializeIp65504P1899L(short ip65504P1899L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1899L,IP_65504_P_1899_L_LEN)
                  ,beginIp65504P1899L
                  ,IP_65504_P_1899_L_LEN
                 );
            localIp65504P1899LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1899LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1899L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1899L() {	 
			return (getShort(beginIp65504P1899L));
   	}
         int localIp65504P1900SCounter = -1;
         public boolean isIp65504P1900SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1900SCounter != sharedCounter;
            localIp65504P1900SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1900_S_LEN = 2;
  	/**
	 * serializeIp65504P1900S
	 */
	protected void serializeIp65504P1900S(short ip65504P1900S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1900S,IP_65504_P_1900_S_LEN)
                  ,beginIp65504P1900S
                  ,IP_65504_P_1900_S_LEN
                 );
            localIp65504P1900SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1900SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1900S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1900S() {	 
			return (getShort(beginIp65504P1900S));
   	}
         int localIp65504P1900LCounter = -1;
         public boolean isIp65504P1900LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1900LCounter != sharedCounter;
            localIp65504P1900LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1900_L_LEN = 2;
  	/**
	 * serializeIp65504P1900L
	 */
	protected void serializeIp65504P1900L(short ip65504P1900L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1900L,IP_65504_P_1900_L_LEN)
                  ,beginIp65504P1900L
                  ,IP_65504_P_1900_L_LEN
                 );
            localIp65504P1900LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1900LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1900L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1900L() {	 
			return (getShort(beginIp65504P1900L));
   	}
         int localIp65504P1901SCounter = -1;
         public boolean isIp65504P1901SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1901SCounter != sharedCounter;
            localIp65504P1901SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1901_S_LEN = 2;
  	/**
	 * serializeIp65504P1901S
	 */
	protected void serializeIp65504P1901S(short ip65504P1901S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1901S,IP_65504_P_1901_S_LEN)
                  ,beginIp65504P1901S
                  ,IP_65504_P_1901_S_LEN
                 );
            localIp65504P1901SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1901SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1901S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1901S() {	 
			return (getShort(beginIp65504P1901S));
   	}
         int localIp65504P1901LCounter = -1;
         public boolean isIp65504P1901LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1901LCounter != sharedCounter;
            localIp65504P1901LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1901_L_LEN = 2;
  	/**
	 * serializeIp65504P1901L
	 */
	protected void serializeIp65504P1901L(short ip65504P1901L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1901L,IP_65504_P_1901_L_LEN)
                  ,beginIp65504P1901L
                  ,IP_65504_P_1901_L_LEN
                 );
            localIp65504P1901LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1901LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1901L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1901L() {	 
			return (getShort(beginIp65504P1901L));
   	}
         int localIp65504P1902SCounter = -1;
         public boolean isIp65504P1902SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1902SCounter != sharedCounter;
            localIp65504P1902SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1902_S_LEN = 2;
  	/**
	 * serializeIp65504P1902S
	 */
	protected void serializeIp65504P1902S(short ip65504P1902S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1902S,IP_65504_P_1902_S_LEN)
                  ,beginIp65504P1902S
                  ,IP_65504_P_1902_S_LEN
                 );
            localIp65504P1902SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1902SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1902S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1902S() {	 
			return (getShort(beginIp65504P1902S));
   	}
         int localIp65504P1902LCounter = -1;
         public boolean isIp65504P1902LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1902LCounter != sharedCounter;
            localIp65504P1902LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1902_L_LEN = 2;
  	/**
	 * serializeIp65504P1902L
	 */
	protected void serializeIp65504P1902L(short ip65504P1902L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1902L,IP_65504_P_1902_L_LEN)
                  ,beginIp65504P1902L
                  ,IP_65504_P_1902_L_LEN
                 );
            localIp65504P1902LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1902LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1902L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1902L() {	 
			return (getShort(beginIp65504P1902L));
   	}
         int localIp65504P1903SCounter = -1;
         public boolean isIp65504P1903SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1903SCounter != sharedCounter;
            localIp65504P1903SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1903_S_LEN = 2;
  	/**
	 * serializeIp65504P1903S
	 */
	protected void serializeIp65504P1903S(short ip65504P1903S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1903S,IP_65504_P_1903_S_LEN)
                  ,beginIp65504P1903S
                  ,IP_65504_P_1903_S_LEN
                 );
            localIp65504P1903SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1903SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1903S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1903S() {	 
			return (getShort(beginIp65504P1903S));
   	}
         int localIp65504P1903LCounter = -1;
         public boolean isIp65504P1903LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1903LCounter != sharedCounter;
            localIp65504P1903LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1903_L_LEN = 2;
  	/**
	 * serializeIp65504P1903L
	 */
	protected void serializeIp65504P1903L(short ip65504P1903L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1903L,IP_65504_P_1903_L_LEN)
                  ,beginIp65504P1903L
                  ,IP_65504_P_1903_L_LEN
                 );
            localIp65504P1903LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1903LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1903L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1903L() {	 
			return (getShort(beginIp65504P1903L));
   	}
         int localIp65504P1904SCounter = -1;
         public boolean isIp65504P1904SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1904SCounter != sharedCounter;
            localIp65504P1904SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1904_S_LEN = 2;
  	/**
	 * serializeIp65504P1904S
	 */
	protected void serializeIp65504P1904S(short ip65504P1904S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1904S,IP_65504_P_1904_S_LEN)
                  ,beginIp65504P1904S
                  ,IP_65504_P_1904_S_LEN
                 );
            localIp65504P1904SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1904SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1904S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1904S() {	 
			return (getShort(beginIp65504P1904S));
   	}
         int localIp65504P1904LCounter = -1;
         public boolean isIp65504P1904LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1904LCounter != sharedCounter;
            localIp65504P1904LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1904_L_LEN = 2;
  	/**
	 * serializeIp65504P1904L
	 */
	protected void serializeIp65504P1904L(short ip65504P1904L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1904L,IP_65504_P_1904_L_LEN)
                  ,beginIp65504P1904L
                  ,IP_65504_P_1904_L_LEN
                 );
            localIp65504P1904LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1904LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1904L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1904L() {	 
			return (getShort(beginIp65504P1904L));
   	}
         int localIp65504P1905SCounter = -1;
         public boolean isIp65504P1905SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1905SCounter != sharedCounter;
            localIp65504P1905SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1905_S_LEN = 2;
  	/**
	 * serializeIp65504P1905S
	 */
	protected void serializeIp65504P1905S(short ip65504P1905S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1905S,IP_65504_P_1905_S_LEN)
                  ,beginIp65504P1905S
                  ,IP_65504_P_1905_S_LEN
                 );
            localIp65504P1905SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1905SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1905S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1905S() {	 
			return (getShort(beginIp65504P1905S));
   	}
         int localIp65504P1905LCounter = -1;
         public boolean isIp65504P1905LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1905LCounter != sharedCounter;
            localIp65504P1905LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1905_L_LEN = 2;
  	/**
	 * serializeIp65504P1905L
	 */
	protected void serializeIp65504P1905L(short ip65504P1905L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1905L,IP_65504_P_1905_L_LEN)
                  ,beginIp65504P1905L
                  ,IP_65504_P_1905_L_LEN
                 );
            localIp65504P1905LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1905LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1905L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1905L() {	 
			return (getShort(beginIp65504P1905L));
   	}
         int localIp65504P1906SCounter = -1;
         public boolean isIp65504P1906SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1906SCounter != sharedCounter;
            localIp65504P1906SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1906_S_LEN = 2;
  	/**
	 * serializeIp65504P1906S
	 */
	protected void serializeIp65504P1906S(short ip65504P1906S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1906S,IP_65504_P_1906_S_LEN)
                  ,beginIp65504P1906S
                  ,IP_65504_P_1906_S_LEN
                 );
            localIp65504P1906SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1906SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1906S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1906S() {	 
			return (getShort(beginIp65504P1906S));
   	}
         int localIp65504P1906LCounter = -1;
         public boolean isIp65504P1906LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1906LCounter != sharedCounter;
            localIp65504P1906LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1906_L_LEN = 2;
  	/**
	 * serializeIp65504P1906L
	 */
	protected void serializeIp65504P1906L(short ip65504P1906L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1906L,IP_65504_P_1906_L_LEN)
                  ,beginIp65504P1906L
                  ,IP_65504_P_1906_L_LEN
                 );
            localIp65504P1906LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1906LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1906L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1906L() {	 
			return (getShort(beginIp65504P1906L));
   	}
         int localIp65504P1907SCounter = -1;
         public boolean isIp65504P1907SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1907SCounter != sharedCounter;
            localIp65504P1907SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1907_S_LEN = 2;
  	/**
	 * serializeIp65504P1907S
	 */
	protected void serializeIp65504P1907S(short ip65504P1907S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1907S,IP_65504_P_1907_S_LEN)
                  ,beginIp65504P1907S
                  ,IP_65504_P_1907_S_LEN
                 );
            localIp65504P1907SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1907SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1907S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1907S() {	 
			return (getShort(beginIp65504P1907S));
   	}
         int localIp65504P1907LCounter = -1;
         public boolean isIp65504P1907LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1907LCounter != sharedCounter;
            localIp65504P1907LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1907_L_LEN = 2;
  	/**
	 * serializeIp65504P1907L
	 */
	protected void serializeIp65504P1907L(short ip65504P1907L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1907L,IP_65504_P_1907_L_LEN)
                  ,beginIp65504P1907L
                  ,IP_65504_P_1907_L_LEN
                 );
            localIp65504P1907LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1907LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1907L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1907L() {	 
			return (getShort(beginIp65504P1907L));
   	}
         int localIp65504P1908SCounter = -1;
         public boolean isIp65504P1908SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1908SCounter != sharedCounter;
            localIp65504P1908SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1908_S_LEN = 2;
  	/**
	 * serializeIp65504P1908S
	 */
	protected void serializeIp65504P1908S(short ip65504P1908S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1908S,IP_65504_P_1908_S_LEN)
                  ,beginIp65504P1908S
                  ,IP_65504_P_1908_S_LEN
                 );
            localIp65504P1908SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1908SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1908S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1908S() {	 
			return (getShort(beginIp65504P1908S));
   	}
         int localIp65504P1908LCounter = -1;
         public boolean isIp65504P1908LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1908LCounter != sharedCounter;
            localIp65504P1908LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1908_L_LEN = 2;
  	/**
	 * serializeIp65504P1908L
	 */
	protected void serializeIp65504P1908L(short ip65504P1908L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1908L,IP_65504_P_1908_L_LEN)
                  ,beginIp65504P1908L
                  ,IP_65504_P_1908_L_LEN
                 );
            localIp65504P1908LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1908LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1908L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1908L() {	 
			return (getShort(beginIp65504P1908L));
   	}
         int localIp65504P1909SCounter = -1;
         public boolean isIp65504P1909SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1909SCounter != sharedCounter;
            localIp65504P1909SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1909_S_LEN = 2;
  	/**
	 * serializeIp65504P1909S
	 */
	protected void serializeIp65504P1909S(short ip65504P1909S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1909S,IP_65504_P_1909_S_LEN)
                  ,beginIp65504P1909S
                  ,IP_65504_P_1909_S_LEN
                 );
            localIp65504P1909SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1909SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1909S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1909S() {	 
			return (getShort(beginIp65504P1909S));
   	}
         int localIp65504P1909LCounter = -1;
         public boolean isIp65504P1909LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1909LCounter != sharedCounter;
            localIp65504P1909LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1909_L_LEN = 2;
  	/**
	 * serializeIp65504P1909L
	 */
	protected void serializeIp65504P1909L(short ip65504P1909L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1909L,IP_65504_P_1909_L_LEN)
                  ,beginIp65504P1909L
                  ,IP_65504_P_1909_L_LEN
                 );
            localIp65504P1909LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1909LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1909L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1909L() {	 
			return (getShort(beginIp65504P1909L));
   	}
         int localIp65504P1910SCounter = -1;
         public boolean isIp65504P1910SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1910SCounter != sharedCounter;
            localIp65504P1910SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1910_S_LEN = 2;
  	/**
	 * serializeIp65504P1910S
	 */
	protected void serializeIp65504P1910S(short ip65504P1910S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1910S,IP_65504_P_1910_S_LEN)
                  ,beginIp65504P1910S
                  ,IP_65504_P_1910_S_LEN
                 );
            localIp65504P1910SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1910SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1910S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1910S() {	 
			return (getShort(beginIp65504P1910S));
   	}
         int localIp65504P1910LCounter = -1;
         public boolean isIp65504P1910LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1910LCounter != sharedCounter;
            localIp65504P1910LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1910_L_LEN = 2;
  	/**
	 * serializeIp65504P1910L
	 */
	protected void serializeIp65504P1910L(short ip65504P1910L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1910L,IP_65504_P_1910_L_LEN)
                  ,beginIp65504P1910L
                  ,IP_65504_P_1910_L_LEN
                 );
            localIp65504P1910LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1910LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1910L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1910L() {	 
			return (getShort(beginIp65504P1910L));
   	}
         int localIp65504P1911SCounter = -1;
         public boolean isIp65504P1911SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1911SCounter != sharedCounter;
            localIp65504P1911SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1911_S_LEN = 2;
  	/**
	 * serializeIp65504P1911S
	 */
	protected void serializeIp65504P1911S(short ip65504P1911S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1911S,IP_65504_P_1911_S_LEN)
                  ,beginIp65504P1911S
                  ,IP_65504_P_1911_S_LEN
                 );
            localIp65504P1911SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1911SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1911S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1911S() {	 
			return (getShort(beginIp65504P1911S));
   	}
         int localIp65504P1911LCounter = -1;
         public boolean isIp65504P1911LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1911LCounter != sharedCounter;
            localIp65504P1911LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1911_L_LEN = 2;
  	/**
	 * serializeIp65504P1911L
	 */
	protected void serializeIp65504P1911L(short ip65504P1911L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1911L,IP_65504_P_1911_L_LEN)
                  ,beginIp65504P1911L
                  ,IP_65504_P_1911_L_LEN
                 );
            localIp65504P1911LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1911LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1911L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1911L() {	 
			return (getShort(beginIp65504P1911L));
   	}
         int localIp65504P1912SCounter = -1;
         public boolean isIp65504P1912SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1912SCounter != sharedCounter;
            localIp65504P1912SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1912_S_LEN = 2;
  	/**
	 * serializeIp65504P1912S
	 */
	protected void serializeIp65504P1912S(short ip65504P1912S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1912S,IP_65504_P_1912_S_LEN)
                  ,beginIp65504P1912S
                  ,IP_65504_P_1912_S_LEN
                 );
            localIp65504P1912SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1912SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1912S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1912S() {	 
			return (getShort(beginIp65504P1912S));
   	}
         int localIp65504P1912LCounter = -1;
         public boolean isIp65504P1912LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1912LCounter != sharedCounter;
            localIp65504P1912LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1912_L_LEN = 2;
  	/**
	 * serializeIp65504P1912L
	 */
	protected void serializeIp65504P1912L(short ip65504P1912L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1912L,IP_65504_P_1912_L_LEN)
                  ,beginIp65504P1912L
                  ,IP_65504_P_1912_L_LEN
                 );
            localIp65504P1912LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1912LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1912L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1912L() {	 
			return (getShort(beginIp65504P1912L));
   	}
         int localIp65504P1913SCounter = -1;
         public boolean isIp65504P1913SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1913SCounter != sharedCounter;
            localIp65504P1913SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1913_S_LEN = 2;
  	/**
	 * serializeIp65504P1913S
	 */
	protected void serializeIp65504P1913S(short ip65504P1913S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1913S,IP_65504_P_1913_S_LEN)
                  ,beginIp65504P1913S
                  ,IP_65504_P_1913_S_LEN
                 );
            localIp65504P1913SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1913SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1913S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1913S() {	 
			return (getShort(beginIp65504P1913S));
   	}
         int localIp65504P1913LCounter = -1;
         public boolean isIp65504P1913LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1913LCounter != sharedCounter;
            localIp65504P1913LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1913_L_LEN = 2;
  	/**
	 * serializeIp65504P1913L
	 */
	protected void serializeIp65504P1913L(short ip65504P1913L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1913L,IP_65504_P_1913_L_LEN)
                  ,beginIp65504P1913L
                  ,IP_65504_P_1913_L_LEN
                 );
            localIp65504P1913LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1913LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1913L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1913L() {	 
			return (getShort(beginIp65504P1913L));
   	}
         int localIp65504P1914SCounter = -1;
         public boolean isIp65504P1914SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1914SCounter != sharedCounter;
            localIp65504P1914SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1914_S_LEN = 2;
  	/**
	 * serializeIp65504P1914S
	 */
	protected void serializeIp65504P1914S(short ip65504P1914S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1914S,IP_65504_P_1914_S_LEN)
                  ,beginIp65504P1914S
                  ,IP_65504_P_1914_S_LEN
                 );
            localIp65504P1914SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1914SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1914S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1914S() {	 
			return (getShort(beginIp65504P1914S));
   	}
         int localIp65504P1914LCounter = -1;
         public boolean isIp65504P1914LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1914LCounter != sharedCounter;
            localIp65504P1914LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1914_L_LEN = 2;
  	/**
	 * serializeIp65504P1914L
	 */
	protected void serializeIp65504P1914L(short ip65504P1914L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1914L,IP_65504_P_1914_L_LEN)
                  ,beginIp65504P1914L
                  ,IP_65504_P_1914_L_LEN
                 );
            localIp65504P1914LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1914LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1914L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1914L() {	 
			return (getShort(beginIp65504P1914L));
   	}
         int localIp65504P1915SCounter = -1;
         public boolean isIp65504P1915SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1915SCounter != sharedCounter;
            localIp65504P1915SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1915_S_LEN = 2;
  	/**
	 * serializeIp65504P1915S
	 */
	protected void serializeIp65504P1915S(short ip65504P1915S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1915S,IP_65504_P_1915_S_LEN)
                  ,beginIp65504P1915S
                  ,IP_65504_P_1915_S_LEN
                 );
            localIp65504P1915SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1915SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1915S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1915S() {	 
			return (getShort(beginIp65504P1915S));
   	}
         int localIp65504P1915LCounter = -1;
         public boolean isIp65504P1915LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1915LCounter != sharedCounter;
            localIp65504P1915LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1915_L_LEN = 2;
  	/**
	 * serializeIp65504P1915L
	 */
	protected void serializeIp65504P1915L(short ip65504P1915L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1915L,IP_65504_P_1915_L_LEN)
                  ,beginIp65504P1915L
                  ,IP_65504_P_1915_L_LEN
                 );
            localIp65504P1915LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1915LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1915L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1915L() {	 
			return (getShort(beginIp65504P1915L));
   	}
         int localIp65504P1916SCounter = -1;
         public boolean isIp65504P1916SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1916SCounter != sharedCounter;
            localIp65504P1916SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1916_S_LEN = 2;
  	/**
	 * serializeIp65504P1916S
	 */
	protected void serializeIp65504P1916S(short ip65504P1916S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1916S,IP_65504_P_1916_S_LEN)
                  ,beginIp65504P1916S
                  ,IP_65504_P_1916_S_LEN
                 );
            localIp65504P1916SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1916SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1916S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1916S() {	 
			return (getShort(beginIp65504P1916S));
   	}
         int localIp65504P1916LCounter = -1;
         public boolean isIp65504P1916LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1916LCounter != sharedCounter;
            localIp65504P1916LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1916_L_LEN = 2;
  	/**
	 * serializeIp65504P1916L
	 */
	protected void serializeIp65504P1916L(short ip65504P1916L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1916L,IP_65504_P_1916_L_LEN)
                  ,beginIp65504P1916L
                  ,IP_65504_P_1916_L_LEN
                 );
            localIp65504P1916LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1916LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1916L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1916L() {	 
			return (getShort(beginIp65504P1916L));
   	}
         int localIp65504P1917SCounter = -1;
         public boolean isIp65504P1917SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1917SCounter != sharedCounter;
            localIp65504P1917SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1917_S_LEN = 2;
  	/**
	 * serializeIp65504P1917S
	 */
	protected void serializeIp65504P1917S(short ip65504P1917S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1917S,IP_65504_P_1917_S_LEN)
                  ,beginIp65504P1917S
                  ,IP_65504_P_1917_S_LEN
                 );
            localIp65504P1917SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1917SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1917S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1917S() {	 
			return (getShort(beginIp65504P1917S));
   	}
         int localIp65504P1917LCounter = -1;
         public boolean isIp65504P1917LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1917LCounter != sharedCounter;
            localIp65504P1917LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1917_L_LEN = 2;
  	/**
	 * serializeIp65504P1917L
	 */
	protected void serializeIp65504P1917L(short ip65504P1917L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1917L,IP_65504_P_1917_L_LEN)
                  ,beginIp65504P1917L
                  ,IP_65504_P_1917_L_LEN
                 );
            localIp65504P1917LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1917LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1917L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1917L() {	 
			return (getShort(beginIp65504P1917L));
   	}
         int localIp65504P1918SCounter = -1;
         public boolean isIp65504P1918SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1918SCounter != sharedCounter;
            localIp65504P1918SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1918_S_LEN = 2;
  	/**
	 * serializeIp65504P1918S
	 */
	protected void serializeIp65504P1918S(short ip65504P1918S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1918S,IP_65504_P_1918_S_LEN)
                  ,beginIp65504P1918S
                  ,IP_65504_P_1918_S_LEN
                 );
            localIp65504P1918SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1918SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1918S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1918S() {	 
			return (getShort(beginIp65504P1918S));
   	}
         int localIp65504P1918LCounter = -1;
         public boolean isIp65504P1918LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1918LCounter != sharedCounter;
            localIp65504P1918LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1918_L_LEN = 2;
  	/**
	 * serializeIp65504P1918L
	 */
	protected void serializeIp65504P1918L(short ip65504P1918L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1918L,IP_65504_P_1918_L_LEN)
                  ,beginIp65504P1918L
                  ,IP_65504_P_1918_L_LEN
                 );
            localIp65504P1918LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1918LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1918L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1918L() {	 
			return (getShort(beginIp65504P1918L));
   	}
         int localIp65504P1919SCounter = -1;
         public boolean isIp65504P1919SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1919SCounter != sharedCounter;
            localIp65504P1919SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1919_S_LEN = 2;
  	/**
	 * serializeIp65504P1919S
	 */
	protected void serializeIp65504P1919S(short ip65504P1919S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1919S,IP_65504_P_1919_S_LEN)
                  ,beginIp65504P1919S
                  ,IP_65504_P_1919_S_LEN
                 );
            localIp65504P1919SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1919SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1919S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1919S() {	 
			return (getShort(beginIp65504P1919S));
   	}
         int localIp65504P1919LCounter = -1;
         public boolean isIp65504P1919LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1919LCounter != sharedCounter;
            localIp65504P1919LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1919_L_LEN = 2;
  	/**
	 * serializeIp65504P1919L
	 */
	protected void serializeIp65504P1919L(short ip65504P1919L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1919L,IP_65504_P_1919_L_LEN)
                  ,beginIp65504P1919L
                  ,IP_65504_P_1919_L_LEN
                 );
            localIp65504P1919LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1919LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1919L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1919L() {	 
			return (getShort(beginIp65504P1919L));
   	}
         int localIp65504P1920SCounter = -1;
         public boolean isIp65504P1920SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1920SCounter != sharedCounter;
            localIp65504P1920SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1920_S_LEN = 2;
  	/**
	 * serializeIp65504P1920S
	 */
	protected void serializeIp65504P1920S(short ip65504P1920S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1920S,IP_65504_P_1920_S_LEN)
                  ,beginIp65504P1920S
                  ,IP_65504_P_1920_S_LEN
                 );
            localIp65504P1920SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1920SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1920S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1920S() {	 
			return (getShort(beginIp65504P1920S));
   	}
         int localIp65504P1920LCounter = -1;
         public boolean isIp65504P1920LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1920LCounter != sharedCounter;
            localIp65504P1920LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1920_L_LEN = 2;
  	/**
	 * serializeIp65504P1920L
	 */
	protected void serializeIp65504P1920L(short ip65504P1920L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1920L,IP_65504_P_1920_L_LEN)
                  ,beginIp65504P1920L
                  ,IP_65504_P_1920_L_LEN
                 );
            localIp65504P1920LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1920LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1920L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1920L() {	 
			return (getShort(beginIp65504P1920L));
   	}
         int localIp65504P1921SCounter = -1;
         public boolean isIp65504P1921SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1921SCounter != sharedCounter;
            localIp65504P1921SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1921_S_LEN = 2;
  	/**
	 * serializeIp65504P1921S
	 */
	protected void serializeIp65504P1921S(short ip65504P1921S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1921S,IP_65504_P_1921_S_LEN)
                  ,beginIp65504P1921S
                  ,IP_65504_P_1921_S_LEN
                 );
            localIp65504P1921SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1921SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1921S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1921S() {	 
			return (getShort(beginIp65504P1921S));
   	}
         int localIp65504P1921LCounter = -1;
         public boolean isIp65504P1921LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1921LCounter != sharedCounter;
            localIp65504P1921LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1921_L_LEN = 2;
  	/**
	 * serializeIp65504P1921L
	 */
	protected void serializeIp65504P1921L(short ip65504P1921L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1921L,IP_65504_P_1921_L_LEN)
                  ,beginIp65504P1921L
                  ,IP_65504_P_1921_L_LEN
                 );
            localIp65504P1921LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1921LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1921L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1921L() {	 
			return (getShort(beginIp65504P1921L));
   	}
         int localIp65504P1922SCounter = -1;
         public boolean isIp65504P1922SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1922SCounter != sharedCounter;
            localIp65504P1922SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1922_S_LEN = 2;
  	/**
	 * serializeIp65504P1922S
	 */
	protected void serializeIp65504P1922S(short ip65504P1922S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1922S,IP_65504_P_1922_S_LEN)
                  ,beginIp65504P1922S
                  ,IP_65504_P_1922_S_LEN
                 );
            localIp65504P1922SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1922SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1922S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1922S() {	 
			return (getShort(beginIp65504P1922S));
   	}
         int localIp65504P1922LCounter = -1;
         public boolean isIp65504P1922LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P1922LCounter != sharedCounter;
            localIp65504P1922LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_1922_L_LEN = 2;
  	/**
	 * serializeIp65504P1922L
	 */
	protected void serializeIp65504P1922L(short ip65504P1922L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P1922L,IP_65504_P_1922_L_LEN)
                  ,beginIp65504P1922L
                  ,IP_65504_P_1922_L_LEN
                 );
            localIp65504P1922LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P1922LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P1922L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P1922L() {	 
			return (getShort(beginIp65504P1922L));
   	}




}
  

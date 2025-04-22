package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup95Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:14. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup95Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup95Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_95_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P2915S;
            protected  int beginIp65504P2915L;
            protected  int beginIp65504P2916S;
            protected  int beginIp65504P2916L;
            protected  int beginIp65504P2917S;
            protected  int beginIp65504P2917L;
            protected  int beginIp65504P2918S;
            protected  int beginIp65504P2918L;
            protected  int beginIp65504P2919S;
            protected  int beginIp65504P2919L;
            protected  int beginIp65504P2920S;
            protected  int beginIp65504P2920L;
            protected  int beginIp65504P2921S;
            protected  int beginIp65504P2921L;
            protected  int beginIp65504P2922S;
            protected  int beginIp65504P2922L;
            protected  int beginIp65504P2923S;
            protected  int beginIp65504P2923L;
            protected  int beginIp65504P2924S;
            protected  int beginIp65504P2924L;
            protected  int beginIp65504P2925S;
            protected  int beginIp65504P2925L;
            protected  int beginIp65504P2926S;
            protected  int beginIp65504P2926L;
            protected  int beginIp65504P2927S;
            protected  int beginIp65504P2927L;
            protected  int beginIp65504P2928S;
            protected  int beginIp65504P2928L;
            protected  int beginIp65504P2929S;
            protected  int beginIp65504P2929L;
            protected  int beginIp65504P2930S;
            protected  int beginIp65504P2930L;
            protected  int beginIp65504P2931S;
            protected  int beginIp65504P2931L;
            protected  int beginIp65504P2932S;
            protected  int beginIp65504P2932L;
            protected  int beginIp65504P2933S;
            protected  int beginIp65504P2933L;
            protected  int beginIp65504P2934S;
            protected  int beginIp65504P2934L;
            protected  int beginIp65504P2935S;
            protected  int beginIp65504P2935L;
            protected  int beginIp65504P2936S;
            protected  int beginIp65504P2936L;
            protected  int beginIp65504P2937S;
            protected  int beginIp65504P2937L;
            protected  int beginIp65504P2938S;
            protected  int beginIp65504P2938L;
            protected  int beginIp65504P2939S;
            protected  int beginIp65504P2939L;
            protected  int beginIp65504P2940S;
            protected  int beginIp65504P2940L;
            protected  int beginIp65504P2941S;
            protected  int beginIp65504P2941L;
            protected  int beginIp65504P2942S;
            protected  int beginIp65504P2942L;
            protected  int beginIp65504P2943S;
            protected  int beginIp65504P2943L;
            protected  int beginIp65504P2944S;
            protected  int beginIp65504P2944L;
            protected  int beginIp65504P2945S;
            protected  int beginIp65504P2945L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup95Serialized
	**/
    public Ip65504PdsNamesLargeGroup95Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup95Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup95Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup95Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,23308); // serialize this field at offset 23308 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup95Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 23308 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup95Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_95_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P2915S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P2915L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P2916S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P2916L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P2917S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P2917L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P2918S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P2918L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P2919S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P2919L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P2920S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P2920L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P2921S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P2921L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P2922S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P2922L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P2923S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P2923L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P2924S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P2924L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P2925S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P2925L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P2926S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P2926L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P2927S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P2927L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P2928S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P2928L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P2929S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P2929L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P2930S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P2930L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P2931S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P2931L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P2932S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P2932L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P2933S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P2933L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P2934S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P2934L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P2935S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P2935L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P2936S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P2936L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P2937S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P2937L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P2938S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P2938L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P2939S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P2939L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P2940S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P2940L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P2941S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P2941L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P2942S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P2942L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P2943S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P2943L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P2944S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P2944L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P2945S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P2945L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P2915SCounter = -1;
         public boolean isIp65504P2915SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2915SCounter != sharedCounter;
            localIp65504P2915SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2915_S_LEN = 2;
  	/**
	 * serializeIp65504P2915S
	 */
	protected void serializeIp65504P2915S(short ip65504P2915S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2915S,IP_65504_P_2915_S_LEN)
                  ,beginIp65504P2915S
                  ,IP_65504_P_2915_S_LEN
                 );
            localIp65504P2915SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2915SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2915S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2915S() {	 
			return (getShort(beginIp65504P2915S));
   	}
         int localIp65504P2915LCounter = -1;
         public boolean isIp65504P2915LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2915LCounter != sharedCounter;
            localIp65504P2915LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2915_L_LEN = 2;
  	/**
	 * serializeIp65504P2915L
	 */
	protected void serializeIp65504P2915L(short ip65504P2915L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2915L,IP_65504_P_2915_L_LEN)
                  ,beginIp65504P2915L
                  ,IP_65504_P_2915_L_LEN
                 );
            localIp65504P2915LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2915LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2915L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2915L() {	 
			return (getShort(beginIp65504P2915L));
   	}
         int localIp65504P2916SCounter = -1;
         public boolean isIp65504P2916SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2916SCounter != sharedCounter;
            localIp65504P2916SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2916_S_LEN = 2;
  	/**
	 * serializeIp65504P2916S
	 */
	protected void serializeIp65504P2916S(short ip65504P2916S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2916S,IP_65504_P_2916_S_LEN)
                  ,beginIp65504P2916S
                  ,IP_65504_P_2916_S_LEN
                 );
            localIp65504P2916SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2916SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2916S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2916S() {	 
			return (getShort(beginIp65504P2916S));
   	}
         int localIp65504P2916LCounter = -1;
         public boolean isIp65504P2916LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2916LCounter != sharedCounter;
            localIp65504P2916LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2916_L_LEN = 2;
  	/**
	 * serializeIp65504P2916L
	 */
	protected void serializeIp65504P2916L(short ip65504P2916L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2916L,IP_65504_P_2916_L_LEN)
                  ,beginIp65504P2916L
                  ,IP_65504_P_2916_L_LEN
                 );
            localIp65504P2916LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2916LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2916L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2916L() {	 
			return (getShort(beginIp65504P2916L));
   	}
         int localIp65504P2917SCounter = -1;
         public boolean isIp65504P2917SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2917SCounter != sharedCounter;
            localIp65504P2917SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2917_S_LEN = 2;
  	/**
	 * serializeIp65504P2917S
	 */
	protected void serializeIp65504P2917S(short ip65504P2917S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2917S,IP_65504_P_2917_S_LEN)
                  ,beginIp65504P2917S
                  ,IP_65504_P_2917_S_LEN
                 );
            localIp65504P2917SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2917SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2917S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2917S() {	 
			return (getShort(beginIp65504P2917S));
   	}
         int localIp65504P2917LCounter = -1;
         public boolean isIp65504P2917LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2917LCounter != sharedCounter;
            localIp65504P2917LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2917_L_LEN = 2;
  	/**
	 * serializeIp65504P2917L
	 */
	protected void serializeIp65504P2917L(short ip65504P2917L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2917L,IP_65504_P_2917_L_LEN)
                  ,beginIp65504P2917L
                  ,IP_65504_P_2917_L_LEN
                 );
            localIp65504P2917LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2917LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2917L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2917L() {	 
			return (getShort(beginIp65504P2917L));
   	}
         int localIp65504P2918SCounter = -1;
         public boolean isIp65504P2918SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2918SCounter != sharedCounter;
            localIp65504P2918SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2918_S_LEN = 2;
  	/**
	 * serializeIp65504P2918S
	 */
	protected void serializeIp65504P2918S(short ip65504P2918S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2918S,IP_65504_P_2918_S_LEN)
                  ,beginIp65504P2918S
                  ,IP_65504_P_2918_S_LEN
                 );
            localIp65504P2918SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2918SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2918S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2918S() {	 
			return (getShort(beginIp65504P2918S));
   	}
         int localIp65504P2918LCounter = -1;
         public boolean isIp65504P2918LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2918LCounter != sharedCounter;
            localIp65504P2918LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2918_L_LEN = 2;
  	/**
	 * serializeIp65504P2918L
	 */
	protected void serializeIp65504P2918L(short ip65504P2918L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2918L,IP_65504_P_2918_L_LEN)
                  ,beginIp65504P2918L
                  ,IP_65504_P_2918_L_LEN
                 );
            localIp65504P2918LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2918LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2918L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2918L() {	 
			return (getShort(beginIp65504P2918L));
   	}
         int localIp65504P2919SCounter = -1;
         public boolean isIp65504P2919SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2919SCounter != sharedCounter;
            localIp65504P2919SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2919_S_LEN = 2;
  	/**
	 * serializeIp65504P2919S
	 */
	protected void serializeIp65504P2919S(short ip65504P2919S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2919S,IP_65504_P_2919_S_LEN)
                  ,beginIp65504P2919S
                  ,IP_65504_P_2919_S_LEN
                 );
            localIp65504P2919SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2919SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2919S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2919S() {	 
			return (getShort(beginIp65504P2919S));
   	}
         int localIp65504P2919LCounter = -1;
         public boolean isIp65504P2919LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2919LCounter != sharedCounter;
            localIp65504P2919LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2919_L_LEN = 2;
  	/**
	 * serializeIp65504P2919L
	 */
	protected void serializeIp65504P2919L(short ip65504P2919L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2919L,IP_65504_P_2919_L_LEN)
                  ,beginIp65504P2919L
                  ,IP_65504_P_2919_L_LEN
                 );
            localIp65504P2919LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2919LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2919L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2919L() {	 
			return (getShort(beginIp65504P2919L));
   	}
         int localIp65504P2920SCounter = -1;
         public boolean isIp65504P2920SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2920SCounter != sharedCounter;
            localIp65504P2920SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2920_S_LEN = 2;
  	/**
	 * serializeIp65504P2920S
	 */
	protected void serializeIp65504P2920S(short ip65504P2920S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2920S,IP_65504_P_2920_S_LEN)
                  ,beginIp65504P2920S
                  ,IP_65504_P_2920_S_LEN
                 );
            localIp65504P2920SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2920SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2920S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2920S() {	 
			return (getShort(beginIp65504P2920S));
   	}
         int localIp65504P2920LCounter = -1;
         public boolean isIp65504P2920LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2920LCounter != sharedCounter;
            localIp65504P2920LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2920_L_LEN = 2;
  	/**
	 * serializeIp65504P2920L
	 */
	protected void serializeIp65504P2920L(short ip65504P2920L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2920L,IP_65504_P_2920_L_LEN)
                  ,beginIp65504P2920L
                  ,IP_65504_P_2920_L_LEN
                 );
            localIp65504P2920LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2920LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2920L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2920L() {	 
			return (getShort(beginIp65504P2920L));
   	}
         int localIp65504P2921SCounter = -1;
         public boolean isIp65504P2921SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2921SCounter != sharedCounter;
            localIp65504P2921SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2921_S_LEN = 2;
  	/**
	 * serializeIp65504P2921S
	 */
	protected void serializeIp65504P2921S(short ip65504P2921S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2921S,IP_65504_P_2921_S_LEN)
                  ,beginIp65504P2921S
                  ,IP_65504_P_2921_S_LEN
                 );
            localIp65504P2921SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2921SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2921S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2921S() {	 
			return (getShort(beginIp65504P2921S));
   	}
         int localIp65504P2921LCounter = -1;
         public boolean isIp65504P2921LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2921LCounter != sharedCounter;
            localIp65504P2921LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2921_L_LEN = 2;
  	/**
	 * serializeIp65504P2921L
	 */
	protected void serializeIp65504P2921L(short ip65504P2921L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2921L,IP_65504_P_2921_L_LEN)
                  ,beginIp65504P2921L
                  ,IP_65504_P_2921_L_LEN
                 );
            localIp65504P2921LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2921LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2921L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2921L() {	 
			return (getShort(beginIp65504P2921L));
   	}
         int localIp65504P2922SCounter = -1;
         public boolean isIp65504P2922SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2922SCounter != sharedCounter;
            localIp65504P2922SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2922_S_LEN = 2;
  	/**
	 * serializeIp65504P2922S
	 */
	protected void serializeIp65504P2922S(short ip65504P2922S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2922S,IP_65504_P_2922_S_LEN)
                  ,beginIp65504P2922S
                  ,IP_65504_P_2922_S_LEN
                 );
            localIp65504P2922SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2922SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2922S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2922S() {	 
			return (getShort(beginIp65504P2922S));
   	}
         int localIp65504P2922LCounter = -1;
         public boolean isIp65504P2922LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2922LCounter != sharedCounter;
            localIp65504P2922LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2922_L_LEN = 2;
  	/**
	 * serializeIp65504P2922L
	 */
	protected void serializeIp65504P2922L(short ip65504P2922L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2922L,IP_65504_P_2922_L_LEN)
                  ,beginIp65504P2922L
                  ,IP_65504_P_2922_L_LEN
                 );
            localIp65504P2922LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2922LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2922L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2922L() {	 
			return (getShort(beginIp65504P2922L));
   	}
         int localIp65504P2923SCounter = -1;
         public boolean isIp65504P2923SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2923SCounter != sharedCounter;
            localIp65504P2923SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2923_S_LEN = 2;
  	/**
	 * serializeIp65504P2923S
	 */
	protected void serializeIp65504P2923S(short ip65504P2923S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2923S,IP_65504_P_2923_S_LEN)
                  ,beginIp65504P2923S
                  ,IP_65504_P_2923_S_LEN
                 );
            localIp65504P2923SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2923SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2923S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2923S() {	 
			return (getShort(beginIp65504P2923S));
   	}
         int localIp65504P2923LCounter = -1;
         public boolean isIp65504P2923LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2923LCounter != sharedCounter;
            localIp65504P2923LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2923_L_LEN = 2;
  	/**
	 * serializeIp65504P2923L
	 */
	protected void serializeIp65504P2923L(short ip65504P2923L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2923L,IP_65504_P_2923_L_LEN)
                  ,beginIp65504P2923L
                  ,IP_65504_P_2923_L_LEN
                 );
            localIp65504P2923LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2923LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2923L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2923L() {	 
			return (getShort(beginIp65504P2923L));
   	}
         int localIp65504P2924SCounter = -1;
         public boolean isIp65504P2924SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2924SCounter != sharedCounter;
            localIp65504P2924SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2924_S_LEN = 2;
  	/**
	 * serializeIp65504P2924S
	 */
	protected void serializeIp65504P2924S(short ip65504P2924S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2924S,IP_65504_P_2924_S_LEN)
                  ,beginIp65504P2924S
                  ,IP_65504_P_2924_S_LEN
                 );
            localIp65504P2924SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2924SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2924S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2924S() {	 
			return (getShort(beginIp65504P2924S));
   	}
         int localIp65504P2924LCounter = -1;
         public boolean isIp65504P2924LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2924LCounter != sharedCounter;
            localIp65504P2924LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2924_L_LEN = 2;
  	/**
	 * serializeIp65504P2924L
	 */
	protected void serializeIp65504P2924L(short ip65504P2924L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2924L,IP_65504_P_2924_L_LEN)
                  ,beginIp65504P2924L
                  ,IP_65504_P_2924_L_LEN
                 );
            localIp65504P2924LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2924LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2924L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2924L() {	 
			return (getShort(beginIp65504P2924L));
   	}
         int localIp65504P2925SCounter = -1;
         public boolean isIp65504P2925SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2925SCounter != sharedCounter;
            localIp65504P2925SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2925_S_LEN = 2;
  	/**
	 * serializeIp65504P2925S
	 */
	protected void serializeIp65504P2925S(short ip65504P2925S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2925S,IP_65504_P_2925_S_LEN)
                  ,beginIp65504P2925S
                  ,IP_65504_P_2925_S_LEN
                 );
            localIp65504P2925SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2925SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2925S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2925S() {	 
			return (getShort(beginIp65504P2925S));
   	}
         int localIp65504P2925LCounter = -1;
         public boolean isIp65504P2925LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2925LCounter != sharedCounter;
            localIp65504P2925LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2925_L_LEN = 2;
  	/**
	 * serializeIp65504P2925L
	 */
	protected void serializeIp65504P2925L(short ip65504P2925L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2925L,IP_65504_P_2925_L_LEN)
                  ,beginIp65504P2925L
                  ,IP_65504_P_2925_L_LEN
                 );
            localIp65504P2925LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2925LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2925L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2925L() {	 
			return (getShort(beginIp65504P2925L));
   	}
         int localIp65504P2926SCounter = -1;
         public boolean isIp65504P2926SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2926SCounter != sharedCounter;
            localIp65504P2926SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2926_S_LEN = 2;
  	/**
	 * serializeIp65504P2926S
	 */
	protected void serializeIp65504P2926S(short ip65504P2926S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2926S,IP_65504_P_2926_S_LEN)
                  ,beginIp65504P2926S
                  ,IP_65504_P_2926_S_LEN
                 );
            localIp65504P2926SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2926SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2926S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2926S() {	 
			return (getShort(beginIp65504P2926S));
   	}
         int localIp65504P2926LCounter = -1;
         public boolean isIp65504P2926LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2926LCounter != sharedCounter;
            localIp65504P2926LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2926_L_LEN = 2;
  	/**
	 * serializeIp65504P2926L
	 */
	protected void serializeIp65504P2926L(short ip65504P2926L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2926L,IP_65504_P_2926_L_LEN)
                  ,beginIp65504P2926L
                  ,IP_65504_P_2926_L_LEN
                 );
            localIp65504P2926LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2926LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2926L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2926L() {	 
			return (getShort(beginIp65504P2926L));
   	}
         int localIp65504P2927SCounter = -1;
         public boolean isIp65504P2927SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2927SCounter != sharedCounter;
            localIp65504P2927SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2927_S_LEN = 2;
  	/**
	 * serializeIp65504P2927S
	 */
	protected void serializeIp65504P2927S(short ip65504P2927S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2927S,IP_65504_P_2927_S_LEN)
                  ,beginIp65504P2927S
                  ,IP_65504_P_2927_S_LEN
                 );
            localIp65504P2927SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2927SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2927S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2927S() {	 
			return (getShort(beginIp65504P2927S));
   	}
         int localIp65504P2927LCounter = -1;
         public boolean isIp65504P2927LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2927LCounter != sharedCounter;
            localIp65504P2927LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2927_L_LEN = 2;
  	/**
	 * serializeIp65504P2927L
	 */
	protected void serializeIp65504P2927L(short ip65504P2927L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2927L,IP_65504_P_2927_L_LEN)
                  ,beginIp65504P2927L
                  ,IP_65504_P_2927_L_LEN
                 );
            localIp65504P2927LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2927LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2927L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2927L() {	 
			return (getShort(beginIp65504P2927L));
   	}
         int localIp65504P2928SCounter = -1;
         public boolean isIp65504P2928SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2928SCounter != sharedCounter;
            localIp65504P2928SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2928_S_LEN = 2;
  	/**
	 * serializeIp65504P2928S
	 */
	protected void serializeIp65504P2928S(short ip65504P2928S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2928S,IP_65504_P_2928_S_LEN)
                  ,beginIp65504P2928S
                  ,IP_65504_P_2928_S_LEN
                 );
            localIp65504P2928SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2928SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2928S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2928S() {	 
			return (getShort(beginIp65504P2928S));
   	}
         int localIp65504P2928LCounter = -1;
         public boolean isIp65504P2928LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2928LCounter != sharedCounter;
            localIp65504P2928LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2928_L_LEN = 2;
  	/**
	 * serializeIp65504P2928L
	 */
	protected void serializeIp65504P2928L(short ip65504P2928L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2928L,IP_65504_P_2928_L_LEN)
                  ,beginIp65504P2928L
                  ,IP_65504_P_2928_L_LEN
                 );
            localIp65504P2928LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2928LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2928L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2928L() {	 
			return (getShort(beginIp65504P2928L));
   	}
         int localIp65504P2929SCounter = -1;
         public boolean isIp65504P2929SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2929SCounter != sharedCounter;
            localIp65504P2929SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2929_S_LEN = 2;
  	/**
	 * serializeIp65504P2929S
	 */
	protected void serializeIp65504P2929S(short ip65504P2929S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2929S,IP_65504_P_2929_S_LEN)
                  ,beginIp65504P2929S
                  ,IP_65504_P_2929_S_LEN
                 );
            localIp65504P2929SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2929SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2929S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2929S() {	 
			return (getShort(beginIp65504P2929S));
   	}
         int localIp65504P2929LCounter = -1;
         public boolean isIp65504P2929LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2929LCounter != sharedCounter;
            localIp65504P2929LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2929_L_LEN = 2;
  	/**
	 * serializeIp65504P2929L
	 */
	protected void serializeIp65504P2929L(short ip65504P2929L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2929L,IP_65504_P_2929_L_LEN)
                  ,beginIp65504P2929L
                  ,IP_65504_P_2929_L_LEN
                 );
            localIp65504P2929LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2929LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2929L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2929L() {	 
			return (getShort(beginIp65504P2929L));
   	}
         int localIp65504P2930SCounter = -1;
         public boolean isIp65504P2930SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2930SCounter != sharedCounter;
            localIp65504P2930SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2930_S_LEN = 2;
  	/**
	 * serializeIp65504P2930S
	 */
	protected void serializeIp65504P2930S(short ip65504P2930S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2930S,IP_65504_P_2930_S_LEN)
                  ,beginIp65504P2930S
                  ,IP_65504_P_2930_S_LEN
                 );
            localIp65504P2930SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2930SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2930S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2930S() {	 
			return (getShort(beginIp65504P2930S));
   	}
         int localIp65504P2930LCounter = -1;
         public boolean isIp65504P2930LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2930LCounter != sharedCounter;
            localIp65504P2930LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2930_L_LEN = 2;
  	/**
	 * serializeIp65504P2930L
	 */
	protected void serializeIp65504P2930L(short ip65504P2930L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2930L,IP_65504_P_2930_L_LEN)
                  ,beginIp65504P2930L
                  ,IP_65504_P_2930_L_LEN
                 );
            localIp65504P2930LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2930LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2930L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2930L() {	 
			return (getShort(beginIp65504P2930L));
   	}
         int localIp65504P2931SCounter = -1;
         public boolean isIp65504P2931SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2931SCounter != sharedCounter;
            localIp65504P2931SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2931_S_LEN = 2;
  	/**
	 * serializeIp65504P2931S
	 */
	protected void serializeIp65504P2931S(short ip65504P2931S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2931S,IP_65504_P_2931_S_LEN)
                  ,beginIp65504P2931S
                  ,IP_65504_P_2931_S_LEN
                 );
            localIp65504P2931SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2931SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2931S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2931S() {	 
			return (getShort(beginIp65504P2931S));
   	}
         int localIp65504P2931LCounter = -1;
         public boolean isIp65504P2931LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2931LCounter != sharedCounter;
            localIp65504P2931LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2931_L_LEN = 2;
  	/**
	 * serializeIp65504P2931L
	 */
	protected void serializeIp65504P2931L(short ip65504P2931L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2931L,IP_65504_P_2931_L_LEN)
                  ,beginIp65504P2931L
                  ,IP_65504_P_2931_L_LEN
                 );
            localIp65504P2931LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2931LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2931L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2931L() {	 
			return (getShort(beginIp65504P2931L));
   	}
         int localIp65504P2932SCounter = -1;
         public boolean isIp65504P2932SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2932SCounter != sharedCounter;
            localIp65504P2932SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2932_S_LEN = 2;
  	/**
	 * serializeIp65504P2932S
	 */
	protected void serializeIp65504P2932S(short ip65504P2932S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2932S,IP_65504_P_2932_S_LEN)
                  ,beginIp65504P2932S
                  ,IP_65504_P_2932_S_LEN
                 );
            localIp65504P2932SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2932SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2932S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2932S() {	 
			return (getShort(beginIp65504P2932S));
   	}
         int localIp65504P2932LCounter = -1;
         public boolean isIp65504P2932LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2932LCounter != sharedCounter;
            localIp65504P2932LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2932_L_LEN = 2;
  	/**
	 * serializeIp65504P2932L
	 */
	protected void serializeIp65504P2932L(short ip65504P2932L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2932L,IP_65504_P_2932_L_LEN)
                  ,beginIp65504P2932L
                  ,IP_65504_P_2932_L_LEN
                 );
            localIp65504P2932LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2932LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2932L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2932L() {	 
			return (getShort(beginIp65504P2932L));
   	}
         int localIp65504P2933SCounter = -1;
         public boolean isIp65504P2933SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2933SCounter != sharedCounter;
            localIp65504P2933SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2933_S_LEN = 2;
  	/**
	 * serializeIp65504P2933S
	 */
	protected void serializeIp65504P2933S(short ip65504P2933S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2933S,IP_65504_P_2933_S_LEN)
                  ,beginIp65504P2933S
                  ,IP_65504_P_2933_S_LEN
                 );
            localIp65504P2933SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2933SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2933S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2933S() {	 
			return (getShort(beginIp65504P2933S));
   	}
         int localIp65504P2933LCounter = -1;
         public boolean isIp65504P2933LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2933LCounter != sharedCounter;
            localIp65504P2933LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2933_L_LEN = 2;
  	/**
	 * serializeIp65504P2933L
	 */
	protected void serializeIp65504P2933L(short ip65504P2933L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2933L,IP_65504_P_2933_L_LEN)
                  ,beginIp65504P2933L
                  ,IP_65504_P_2933_L_LEN
                 );
            localIp65504P2933LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2933LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2933L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2933L() {	 
			return (getShort(beginIp65504P2933L));
   	}
         int localIp65504P2934SCounter = -1;
         public boolean isIp65504P2934SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2934SCounter != sharedCounter;
            localIp65504P2934SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2934_S_LEN = 2;
  	/**
	 * serializeIp65504P2934S
	 */
	protected void serializeIp65504P2934S(short ip65504P2934S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2934S,IP_65504_P_2934_S_LEN)
                  ,beginIp65504P2934S
                  ,IP_65504_P_2934_S_LEN
                 );
            localIp65504P2934SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2934SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2934S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2934S() {	 
			return (getShort(beginIp65504P2934S));
   	}
         int localIp65504P2934LCounter = -1;
         public boolean isIp65504P2934LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2934LCounter != sharedCounter;
            localIp65504P2934LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2934_L_LEN = 2;
  	/**
	 * serializeIp65504P2934L
	 */
	protected void serializeIp65504P2934L(short ip65504P2934L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2934L,IP_65504_P_2934_L_LEN)
                  ,beginIp65504P2934L
                  ,IP_65504_P_2934_L_LEN
                 );
            localIp65504P2934LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2934LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2934L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2934L() {	 
			return (getShort(beginIp65504P2934L));
   	}
         int localIp65504P2935SCounter = -1;
         public boolean isIp65504P2935SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2935SCounter != sharedCounter;
            localIp65504P2935SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2935_S_LEN = 2;
  	/**
	 * serializeIp65504P2935S
	 */
	protected void serializeIp65504P2935S(short ip65504P2935S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2935S,IP_65504_P_2935_S_LEN)
                  ,beginIp65504P2935S
                  ,IP_65504_P_2935_S_LEN
                 );
            localIp65504P2935SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2935SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2935S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2935S() {	 
			return (getShort(beginIp65504P2935S));
   	}
         int localIp65504P2935LCounter = -1;
         public boolean isIp65504P2935LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2935LCounter != sharedCounter;
            localIp65504P2935LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2935_L_LEN = 2;
  	/**
	 * serializeIp65504P2935L
	 */
	protected void serializeIp65504P2935L(short ip65504P2935L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2935L,IP_65504_P_2935_L_LEN)
                  ,beginIp65504P2935L
                  ,IP_65504_P_2935_L_LEN
                 );
            localIp65504P2935LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2935LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2935L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2935L() {	 
			return (getShort(beginIp65504P2935L));
   	}
         int localIp65504P2936SCounter = -1;
         public boolean isIp65504P2936SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2936SCounter != sharedCounter;
            localIp65504P2936SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2936_S_LEN = 2;
  	/**
	 * serializeIp65504P2936S
	 */
	protected void serializeIp65504P2936S(short ip65504P2936S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2936S,IP_65504_P_2936_S_LEN)
                  ,beginIp65504P2936S
                  ,IP_65504_P_2936_S_LEN
                 );
            localIp65504P2936SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2936SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2936S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2936S() {	 
			return (getShort(beginIp65504P2936S));
   	}
         int localIp65504P2936LCounter = -1;
         public boolean isIp65504P2936LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2936LCounter != sharedCounter;
            localIp65504P2936LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2936_L_LEN = 2;
  	/**
	 * serializeIp65504P2936L
	 */
	protected void serializeIp65504P2936L(short ip65504P2936L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2936L,IP_65504_P_2936_L_LEN)
                  ,beginIp65504P2936L
                  ,IP_65504_P_2936_L_LEN
                 );
            localIp65504P2936LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2936LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2936L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2936L() {	 
			return (getShort(beginIp65504P2936L));
   	}
         int localIp65504P2937SCounter = -1;
         public boolean isIp65504P2937SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2937SCounter != sharedCounter;
            localIp65504P2937SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2937_S_LEN = 2;
  	/**
	 * serializeIp65504P2937S
	 */
	protected void serializeIp65504P2937S(short ip65504P2937S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2937S,IP_65504_P_2937_S_LEN)
                  ,beginIp65504P2937S
                  ,IP_65504_P_2937_S_LEN
                 );
            localIp65504P2937SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2937SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2937S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2937S() {	 
			return (getShort(beginIp65504P2937S));
   	}
         int localIp65504P2937LCounter = -1;
         public boolean isIp65504P2937LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2937LCounter != sharedCounter;
            localIp65504P2937LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2937_L_LEN = 2;
  	/**
	 * serializeIp65504P2937L
	 */
	protected void serializeIp65504P2937L(short ip65504P2937L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2937L,IP_65504_P_2937_L_LEN)
                  ,beginIp65504P2937L
                  ,IP_65504_P_2937_L_LEN
                 );
            localIp65504P2937LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2937LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2937L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2937L() {	 
			return (getShort(beginIp65504P2937L));
   	}
         int localIp65504P2938SCounter = -1;
         public boolean isIp65504P2938SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2938SCounter != sharedCounter;
            localIp65504P2938SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2938_S_LEN = 2;
  	/**
	 * serializeIp65504P2938S
	 */
	protected void serializeIp65504P2938S(short ip65504P2938S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2938S,IP_65504_P_2938_S_LEN)
                  ,beginIp65504P2938S
                  ,IP_65504_P_2938_S_LEN
                 );
            localIp65504P2938SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2938SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2938S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2938S() {	 
			return (getShort(beginIp65504P2938S));
   	}
         int localIp65504P2938LCounter = -1;
         public boolean isIp65504P2938LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2938LCounter != sharedCounter;
            localIp65504P2938LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2938_L_LEN = 2;
  	/**
	 * serializeIp65504P2938L
	 */
	protected void serializeIp65504P2938L(short ip65504P2938L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2938L,IP_65504_P_2938_L_LEN)
                  ,beginIp65504P2938L
                  ,IP_65504_P_2938_L_LEN
                 );
            localIp65504P2938LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2938LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2938L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2938L() {	 
			return (getShort(beginIp65504P2938L));
   	}
         int localIp65504P2939SCounter = -1;
         public boolean isIp65504P2939SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2939SCounter != sharedCounter;
            localIp65504P2939SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2939_S_LEN = 2;
  	/**
	 * serializeIp65504P2939S
	 */
	protected void serializeIp65504P2939S(short ip65504P2939S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2939S,IP_65504_P_2939_S_LEN)
                  ,beginIp65504P2939S
                  ,IP_65504_P_2939_S_LEN
                 );
            localIp65504P2939SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2939SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2939S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2939S() {	 
			return (getShort(beginIp65504P2939S));
   	}
         int localIp65504P2939LCounter = -1;
         public boolean isIp65504P2939LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2939LCounter != sharedCounter;
            localIp65504P2939LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2939_L_LEN = 2;
  	/**
	 * serializeIp65504P2939L
	 */
	protected void serializeIp65504P2939L(short ip65504P2939L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2939L,IP_65504_P_2939_L_LEN)
                  ,beginIp65504P2939L
                  ,IP_65504_P_2939_L_LEN
                 );
            localIp65504P2939LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2939LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2939L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2939L() {	 
			return (getShort(beginIp65504P2939L));
   	}
         int localIp65504P2940SCounter = -1;
         public boolean isIp65504P2940SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2940SCounter != sharedCounter;
            localIp65504P2940SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2940_S_LEN = 2;
  	/**
	 * serializeIp65504P2940S
	 */
	protected void serializeIp65504P2940S(short ip65504P2940S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2940S,IP_65504_P_2940_S_LEN)
                  ,beginIp65504P2940S
                  ,IP_65504_P_2940_S_LEN
                 );
            localIp65504P2940SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2940SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2940S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2940S() {	 
			return (getShort(beginIp65504P2940S));
   	}
         int localIp65504P2940LCounter = -1;
         public boolean isIp65504P2940LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2940LCounter != sharedCounter;
            localIp65504P2940LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2940_L_LEN = 2;
  	/**
	 * serializeIp65504P2940L
	 */
	protected void serializeIp65504P2940L(short ip65504P2940L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2940L,IP_65504_P_2940_L_LEN)
                  ,beginIp65504P2940L
                  ,IP_65504_P_2940_L_LEN
                 );
            localIp65504P2940LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2940LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2940L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2940L() {	 
			return (getShort(beginIp65504P2940L));
   	}
         int localIp65504P2941SCounter = -1;
         public boolean isIp65504P2941SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2941SCounter != sharedCounter;
            localIp65504P2941SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2941_S_LEN = 2;
  	/**
	 * serializeIp65504P2941S
	 */
	protected void serializeIp65504P2941S(short ip65504P2941S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2941S,IP_65504_P_2941_S_LEN)
                  ,beginIp65504P2941S
                  ,IP_65504_P_2941_S_LEN
                 );
            localIp65504P2941SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2941SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2941S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2941S() {	 
			return (getShort(beginIp65504P2941S));
   	}
         int localIp65504P2941LCounter = -1;
         public boolean isIp65504P2941LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2941LCounter != sharedCounter;
            localIp65504P2941LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2941_L_LEN = 2;
  	/**
	 * serializeIp65504P2941L
	 */
	protected void serializeIp65504P2941L(short ip65504P2941L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2941L,IP_65504_P_2941_L_LEN)
                  ,beginIp65504P2941L
                  ,IP_65504_P_2941_L_LEN
                 );
            localIp65504P2941LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2941LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2941L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2941L() {	 
			return (getShort(beginIp65504P2941L));
   	}
         int localIp65504P2942SCounter = -1;
         public boolean isIp65504P2942SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2942SCounter != sharedCounter;
            localIp65504P2942SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2942_S_LEN = 2;
  	/**
	 * serializeIp65504P2942S
	 */
	protected void serializeIp65504P2942S(short ip65504P2942S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2942S,IP_65504_P_2942_S_LEN)
                  ,beginIp65504P2942S
                  ,IP_65504_P_2942_S_LEN
                 );
            localIp65504P2942SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2942SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2942S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2942S() {	 
			return (getShort(beginIp65504P2942S));
   	}
         int localIp65504P2942LCounter = -1;
         public boolean isIp65504P2942LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2942LCounter != sharedCounter;
            localIp65504P2942LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2942_L_LEN = 2;
  	/**
	 * serializeIp65504P2942L
	 */
	protected void serializeIp65504P2942L(short ip65504P2942L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2942L,IP_65504_P_2942_L_LEN)
                  ,beginIp65504P2942L
                  ,IP_65504_P_2942_L_LEN
                 );
            localIp65504P2942LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2942LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2942L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2942L() {	 
			return (getShort(beginIp65504P2942L));
   	}
         int localIp65504P2943SCounter = -1;
         public boolean isIp65504P2943SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2943SCounter != sharedCounter;
            localIp65504P2943SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2943_S_LEN = 2;
  	/**
	 * serializeIp65504P2943S
	 */
	protected void serializeIp65504P2943S(short ip65504P2943S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2943S,IP_65504_P_2943_S_LEN)
                  ,beginIp65504P2943S
                  ,IP_65504_P_2943_S_LEN
                 );
            localIp65504P2943SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2943SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2943S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2943S() {	 
			return (getShort(beginIp65504P2943S));
   	}
         int localIp65504P2943LCounter = -1;
         public boolean isIp65504P2943LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2943LCounter != sharedCounter;
            localIp65504P2943LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2943_L_LEN = 2;
  	/**
	 * serializeIp65504P2943L
	 */
	protected void serializeIp65504P2943L(short ip65504P2943L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2943L,IP_65504_P_2943_L_LEN)
                  ,beginIp65504P2943L
                  ,IP_65504_P_2943_L_LEN
                 );
            localIp65504P2943LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2943LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2943L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2943L() {	 
			return (getShort(beginIp65504P2943L));
   	}
         int localIp65504P2944SCounter = -1;
         public boolean isIp65504P2944SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2944SCounter != sharedCounter;
            localIp65504P2944SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2944_S_LEN = 2;
  	/**
	 * serializeIp65504P2944S
	 */
	protected void serializeIp65504P2944S(short ip65504P2944S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2944S,IP_65504_P_2944_S_LEN)
                  ,beginIp65504P2944S
                  ,IP_65504_P_2944_S_LEN
                 );
            localIp65504P2944SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2944SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2944S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2944S() {	 
			return (getShort(beginIp65504P2944S));
   	}
         int localIp65504P2944LCounter = -1;
         public boolean isIp65504P2944LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2944LCounter != sharedCounter;
            localIp65504P2944LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2944_L_LEN = 2;
  	/**
	 * serializeIp65504P2944L
	 */
	protected void serializeIp65504P2944L(short ip65504P2944L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2944L,IP_65504_P_2944_L_LEN)
                  ,beginIp65504P2944L
                  ,IP_65504_P_2944_L_LEN
                 );
            localIp65504P2944LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2944LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2944L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2944L() {	 
			return (getShort(beginIp65504P2944L));
   	}
         int localIp65504P2945SCounter = -1;
         public boolean isIp65504P2945SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2945SCounter != sharedCounter;
            localIp65504P2945SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2945_S_LEN = 2;
  	/**
	 * serializeIp65504P2945S
	 */
	protected void serializeIp65504P2945S(short ip65504P2945S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2945S,IP_65504_P_2945_S_LEN)
                  ,beginIp65504P2945S
                  ,IP_65504_P_2945_S_LEN
                 );
            localIp65504P2945SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2945SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2945S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2945S() {	 
			return (getShort(beginIp65504P2945S));
   	}
         int localIp65504P2945LCounter = -1;
         public boolean isIp65504P2945LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2945LCounter != sharedCounter;
            localIp65504P2945LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2945_L_LEN = 2;
  	/**
	 * serializeIp65504P2945L
	 */
	protected void serializeIp65504P2945L(short ip65504P2945L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2945L,IP_65504_P_2945_L_LEN)
                  ,beginIp65504P2945L
                  ,IP_65504_P_2945_L_LEN
                 );
            localIp65504P2945LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2945LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2945L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2945L() {	 
			return (getShort(beginIp65504P2945L));
   	}




}
  

package com.cloudframe.app.bm80022.dto;

/**
*  The class AbendLinea6 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class AbendLinea6 extends AbendLinea6Serialized {
   

						@Getter @Setter private char[] filler601 = new char[1];

						@Getter @Setter private char[] filler10 = new char[9];

								@Getter @Setter private long abendSqlcode;

						@Getter @Setter private char[] filler14 = new char[1];

						@Getter @Setter private char[] abendCodigo = new char[3];

						@Getter @Setter private char[] filler15 = new char[1];

						@Getter @Setter private char[] filler12 = new char[9];

						@Getter @Setter private char[] abendSqlwarn = new char[8];

						@Getter @Setter private char[] filler16 = new char[7];

						@Getter @Setter private char[] filler13 = new char[9];

						@Getter @Setter private char[] abendTabla = new char[7];

						@Getter @Setter private char[] filler17 = new char[13];

						@Getter @Setter private char[] filler801 = new char[1];
	
	/**
	* Constructor for AbendLinea6
	**/
    public AbendLinea6() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setFiller601(("*").toCharArray());
								setFiller10(("CODIGO : ").toCharArray());
								setFiller14(fillSpace(1));
								setAbendCodigo(fillSpace(3));
								setFiller15(fillSpace(1));
								setFiller12(("WARNING: ").toCharArray());
								setAbendSqlwarn(fillSpace(8));
								setFiller16(fillSpace(7));
								setFiller13(("TABLA  : ").toCharArray());
								setAbendTabla(fillSpace(7));
								setFiller17(fillSpace(13));
								setFiller801(("*").toCharArray());
    }





}
  

package com.cloudframe.app.bm80022.dto;

/**
*  The class Work is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Work extends WorkSerialized {
   

						@Getter @Setter private char[] litAbrir = new char[5];

						@Getter @Setter private char[] litWrite = new char[5];

						@Getter @Setter private char[] litCerrar = new char[6];

						@Getter @Setter private char[] litGe0001w = new char[8];

						@Getter @Setter private char[] litPrograma = new char[8];

						@Getter @Setter private char[] acceso = new char[8];

						@Getter @Setter private char[] fichero = new char[7];

						@Getter @Setter private char[] fileStatus = new char[2];

						@Getter @Setter private char[] fsGe0001w = new char[2];

								@Getter @Setter private int sqlcode_Ws;

						@Getter @Setter private char[] wkErrorDb2 = new char[2];

						@Getter @Setter private char[] swFinCurGe18 = Field.fillLowValue(1);

						@Getter @Setter private char[] swInfoSalida = Field.fillLowValue(1);

						@Getter @Setter private char[] swFinCursorRowset = new char[1];

								@Getter @Setter private int posRow;

								@Getter @Setter private int regsRecupRowset;

						@Getter @Setter private char[] abendLinea1 = new char[80];

						@Getter @Setter private char[] abendLinea2 = new char[80];

						@Getter @Setter private char[] abendLinea3 = new char[80];

						@Getter @Setter private char[] abendLinea5 = new char[80];

						@Getter @Setter private char[] abendLinea8 = new char[80];

						@Getter @Setter private char[] abendLinea9 = new char[80];

						@Getter @Setter private char[] abendLinea10 = new char[80];

						@Getter @Setter private char[] abendLinea11 = new char[80];

						@Getter @Setter private char[] ge1801Codentid = Field.fillLowValue(2);

						@Getter @Setter private char[] ge1801Tipproduct = Field.fillLowValue(3);

								@Getter @Setter private long ge1801Codcontrat;

								@Getter @Setter private short ge1801Ofigestora;

						@Getter @Setter private char[] ge1801Idepsig = Field.fillLowValue(12);

								@Getter @Setter private int ge1801Numpersona;

								@Getter @Setter private int ge1801Numcartera;

						@Getter @Setter private char[] ge1801Codcartera = Field.fillLowValue(8);

						@Getter @Setter private char[] ge1801Fechaalta = Field.fillLowValue(10);

						@Getter @Setter private char[] ge1801Fechabaja = Field.fillLowValue(10);

						@Getter @Setter private char[] ge1801Codnodo = Field.fillLowValue(8);

						@Getter @Setter private char[] ge1801Resambito = Field.fillLowValue(12);

								@Getter @Setter private int ge1801Numresamb;

								@Getter @Setter private int ge1801Numpresamb;

						@Getter @Setter private char[] ge1801Cengescapt = Field.fillLowValue(8);

								@Getter @Setter private int ge1801Numgescap;

								@Getter @Setter private int ge1801Numpgescap;

								@Getter @Setter private int ge1801Numpesprie;

						@Getter @Setter private char[] ge1801Codcarrie = Field.fillLowValue(8);

						@Getter @Setter private char[] ge1801Fecciecurso = Field.fillLowValue(10);

								@Getter @Setter private int dsnnrows;
	
	/**
	* Constructor for Work
	**/
    public Work() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setLitAbrir(("ABRIR").toCharArray());
								setLitWrite(("WRITE").toCharArray());
								setLitCerrar(("CERRAR").toCharArray());
								setLitGe0001w(("GE0001W ").toCharArray());
								setLitPrograma(("GE80022 ").toCharArray());
								setAcceso(fillSpace(8));
								setFichero(fillSpace(7));
								setFileStatus(("00").toCharArray());
								setFsGe0001w(("00").toCharArray());
								setWkErrorDb2(("35").toCharArray());
								setSwFinCursorRowset(("N").toCharArray());
								setPosRow(0);
								setRegsRecupRowset(0);
								setAbendLinea1(String.join("", java.util.Collections.nCopies(80, "*")).toCharArray());
								setAbendLinea2("*****                             A  B  E  N  D                            *****".toCharArray());
								setAbendLinea3(String.join("", java.util.Collections.nCopies(80, "*")).toCharArray());
								setAbendLinea5("*                                                                              *".toCharArray());
								setAbendLinea8("*                                                                              *".toCharArray());
								setAbendLinea9(String.join("", java.util.Collections.nCopies(80, "*")).toCharArray());
								setAbendLinea10(pad(80," ".toCharArray(),' ',RIGHT_PAD));
								setAbendLinea11(pad(80," ".toCharArray(),' ',RIGHT_PAD));
    }





}
  

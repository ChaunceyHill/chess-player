package chess;

public class Square {
	private final int x1; private final int y1;//end coords
	private final int x2; private final int y2;//start coords
	
	public Square(int x, int y, int a, int b){
		this.x1 = x; this.y1 = y;
		this.x2 = a; this.y2 = b;
	}
	public Square(String s){
		char[] chars = s.toCharArray();		
		x2 = chars[0] - 'a' + 2;//add two to all because of padding
		y2 = chars[1] - '1' + 2;
		x1 = chars[2] - 'a' + 2;
		y1 = chars[3] - '1' + 2;
	}
	
	public int getXEnd(){
		return this.x1;
	}
	
	public int getYEnd(){
		return this.y1;
	}
	public int getXStart(){
		return this.x2;
	}
	public int getYStart(){
		return this.y2;
	}
	
	public String toString(){
		String s = "";
		s += "(" + x2 + "," + y2 + ") to (" + x1 + "," + y1 + ")";
		return s;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x1;
		result = prime * result + x2;
		result = prime * result + y1;
		result = prime * result + y2;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Square other = (Square) obj;
		if (x1 != other.x1)
			return false;
		if (x2 != other.x2)
			return false;
		if (y1 != other.y1)
			return false;
		if (y2 != other.y2)
			return false;
		return true;
	}
	
}

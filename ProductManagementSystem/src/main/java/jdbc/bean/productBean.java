package jdbc.bean;

public class productBean 
{
		private int pid;
		private String pname;
		private String catagory;
		private int quantity;
		private double price;
		
		public productBean(int pid, String pname, String catagory, int quantity, double price) {
			super();
			this.pid = pid;
			this.pname = pname;
			this.catagory = catagory;
			this.quantity = quantity;
			this.price = price;
		}
		public int getPid() {
			return pid;
		}
		public void setPid(int pid) {
			this.pid = pid;
		}
		public String getPname() {
			return pname;
		}
		public void setPname(String pname) {
			this.pname = pname;
		}
		public String getCatagory() {
			return catagory;
		}
		public void setCatagory(String catagory) {
			this.catagory = catagory;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		

	}
}

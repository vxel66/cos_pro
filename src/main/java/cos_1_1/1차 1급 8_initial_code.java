package cos_1_1;

import java.util.ArrayList;
import java.util.Iterator;

//DeliveryStore interface, Food and PizzaStore class are written as Inner Class. Read the code below and fill in the blank.
class Solution8 {
    interface DeliveryStore{
        public void setOrderList(String[] orderList); //메소드는 주문 메뉴의 리스트를 매개변수로 받아 저장합니다.
        public int getTotalPrice(); //메소드는 주문받은 음식 가격의 총합을 return 합니다.
    }
    
    class Food{ //Food는 음식을 나타내는 클래스입니다.
        public String name;
        public int price;
        public Food(String name, int price){
            this.name = name;
            this.price = price;
        }
    }
    
    class PizzaStore implements DeliveryStore {
        private ArrayList<Food> menuList;
        private ArrayList<String> orderList;

        //PizzaStore는 피자 배달 전문점을 나타내는 클래스이며 DeliveryStore 인터페이스를 구현합니다.
        public PizzaStore(){
            //init menuList
            menuList = new ArrayList<Food>();   //menuList는 피자 배달 전문점에서 주문 할 수 있는 음식의 리스트를 저장합니다.
            String[] menuNames = {"Cheese", "Potato", "Shrimp", "Pineapple", "Meatball"};
            int[] menuPrices = {11100, 12600, 13300, 21000, 19500};
            for(int i = 0; i < 5; i++)
                menuList.add(new Food(menuNames[i], menuPrices[i]));
            
            //init orderList
            orderList = new ArrayList<String>();    //orderList는 주문 받은 음식들의 이름을 저장합니다.
        }
        
        public void setOrderList(String[] orderList){
            for(int i = 0; i < orderList.length; i++)
                this.orderList.add(orderList[i]);
        }
        
        public int getTotalPrice(){
            int totalPrice = 0;
            Iterator<String> iter = orderList.iterator();
            while (iter.hasNext()) {
                String order = iter.next();
                for(int i = 0; i < menuList.size(); i++)
                    if(order.equals(menuList.get(i).name))
                        totalPrice += menuList.get(i).price;
            }
            return totalPrice;
        }
    }
    
    public int solution(String[] orderList) {
        DeliveryStore deliveryStore = new PizzaStore();
        
        deliveryStore.setOrderList(orderList);
        int totalPrice = deliveryStore.getTotalPrice();
        
        return totalPrice;
    }
    
    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution8 sol = new Solution8();
        String[] orderList = {"Cheese", "Pineapple", "Meatball"};
        int ret = sol.solution(orderList);
        
        // Press Run button to receive output. 
        System.out.println("이민욱_1차_1급.Solution: return value of the method is " + ret + " .");
    }
}
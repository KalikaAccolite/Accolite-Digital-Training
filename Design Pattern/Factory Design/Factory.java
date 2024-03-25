interface Food {
    void FoodDelivery();
}

class ChooseYourFavFood implements Food {
    @Override
    public void FoodDelivery() {
        System.out.println("Choose your fav food for delivery");
    }
}

class SelectThePaymentFood implements Food {
    @Override
    public void FoodDelivery() {
        System.out.println("Select the appropriate payment method.");
    }
}

class PlaceOrder implements Food {
    @Override
    public void FoodDelivery() {
        System.out.println("Place your Order");
    }
}

class OrderBeingPrepared implements Food {
    @Override
    public void FoodDelivery() {
        System.out.println("Food is being prepared at restaurant");
    }
}

class OrderPicked implements Food {
    @Override
    public void FoodDelivery() {
        System.out.println("Food is being picked");
    }
}

class OrderDelivered implements Food {
    @Override
    public void FoodDelivery() {
        System.out.println("Food is being Delivered");
    }
}

interface FoodInterFace {
    Food createFood();
}

class ChooseYourFavFoodFactory implements FoodInterFace {
    @Override
    public Food createFood() {
        return new ChooseYourFavFood();
    }
}

class SelectThePaymentFoodFactory implements FoodInterFace {
    @Override
    public Food createFood() {
        return new SelectThePaymentFood();
    }
}

class PlaceOrderFactory implements FoodInterFace {
    @Override
    public Food createFood() {
        return new PlaceOrder();
    }
}

class OrderBeingPreparedFactory implements FoodInterFace {
    @Override
    public Food createFood() {
        return new OrderBeingPrepared();
    }
}

class OrderPickedFactory implements FoodInterFace {
    @Override
    public Food createFood() {
        return new OrderPicked();
    }
}

class OrderDeliveredFactory implements FoodInterFace {
    @Override
    public Food createFood() {
        return new OrderDelivered();
    }
}

public class Factory {
    public static void main(String[] args) {

        FoodInterFace ChooseYourFavFoodFactory = new ChooseYourFavFoodFactory();
        Food ChooseYourFavFood = ChooseYourFavFoodFactory.createFood();
        ChooseYourFavFood.FoodDelivery();

        FoodInterFace SelectThePaymentFoodFactory = new SelectThePaymentFoodFactory();
        Food SelectThePaymentFood = SelectThePaymentFoodFactory.createFood();
        SelectThePaymentFood.FoodDelivery();

        FoodInterFace PlaceOrderFactory = new PlaceOrderFactory();
        Food PlaceOrder = PlaceOrderFactory.createFood();
        PlaceOrder.FoodDelivery();

        FoodInterFace OrderBeingPreparedFactory = new OrderBeingPreparedFactory();
        Food OrderBeingPrepared = OrderBeingPreparedFactory.createFood();
        OrderBeingPrepared.FoodDelivery();

        FoodInterFace OrderPickedFactory = new OrderPickedFactory();
        Food OrderPicked = OrderPickedFactory.createFood();
        OrderPicked.FoodDelivery();

        FoodInterFace OrderDeliveredFactory = new OrderDeliveredFactory();
        Food OrderDelivered = OrderDeliveredFactory.createFood();
        OrderDelivered.FoodDelivery();

    }

}

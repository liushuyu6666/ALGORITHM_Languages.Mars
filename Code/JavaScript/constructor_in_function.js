function inventoryList() {
    let items = [];
    let itemSet = new Set();

    const add = (item) => {
        itemSet.add(item);
        items.push(item);
    }
    const remove = (item) => {
        if(itemSet.has(item)){
            items = items.filter((it) => {
                return it !== item;
            })
            itemSet.delete(item);
        }
    }
    const getList = () => {
        return items;
    }
    const func = () => {
        return {
            add: add,
            remove: remove,
            getList: getList,
        }
    }
    return func();
}


function main() {

    const c = inventoryList();
    c.add("shirt");
    c.add("trousers");
    c.add("pants");
    c.remove("pants");
    console.log(c.getList())

}

main()
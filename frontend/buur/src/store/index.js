import { createStore, applyMiddleware } from "redux";
import rootReducer from "../reducers/index";
import thunk from "redux-thunk";
import logger from "redux-logger";

const store = createStore(rootReducer, applyMiddleware(logger, thunk));

export default store;

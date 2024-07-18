//
//  RNTSwiftViewManager.swift
//  ad_player_react_native
//
//  Created by Pavel Yevtukhov on 17.07.2024.
//

import UIKit
import AdPlayerSDK

@objc
final class AdPlayerHelper: NSObject {
    override init() {
        super.init()
        
        AdPlayer.initSdk(storeURL: URL(string: Constants.storeURL)!)
        
        AdPlayer.initializePublisher(publisherId: Constants.publisherId, tagId: Constants.tagId) { result in
            switch result {
            case .success:
                print("AdPlayer::initializePublisher: OK")
            case .failure(let error):
                print("AdPlayer::initializePublisher: ERROR:", error.localizedDescription)
            }
        }
    }

    @objc
    func makeView() -> UIView {
        let view = AdPlayerPlacementView(tagId: Constants.tagId)
        return view
    }
}

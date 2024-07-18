//
//  RNTAdPlayerViewManager.m
//  ad_player_react_native
//
//  Created by Pavel Yevtukhov on 17.07.2024.
//

#import <UIKit/UIKit.h>
#import <React/RCTViewManager.h>
#import "ad_player_react_native-Swift.h"

@interface RNTAdplayerViewManager: RCTViewManager
@property (nonatomic) AdPlayerHelper *helper;
@end

@implementation RNTAdplayerViewManager

RCT_EXPORT_MODULE(AdPlayerPlacementView)

- (instancetype)init
{
    self = [super init];
    if (self) {
        _helper = [[AdPlayerHelper alloc] init];
    }
    return self;
}

- (UIView *)view {
    return [self.helper makeView];
}

@end
